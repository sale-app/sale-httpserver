from fabric.api import *
from fabric.contrib import *
from fabric.operations import run, put

def write_version():
    local("mkdir -p deploy/")
    local("mkdir -p deploy/sale/")
    local("rm -f deploy/sale/info")
    local("whoami >> deploy/sale/info")
    local("date >> deploy/sale/info")
    local("git branch -v | grep ^* >> deploy/sale/info")
    env.build_info = "hello"

def aws():
    env.hosts = ['ubuntu@ec2-54-251-203-201.ap-southeast-1.compute.amazonaws.com']
    env.app_directory = "/opt/sale/apache-tomcat-7.0.37/webapps"
    env.role = "aws"

def deploy_app():
    """Deploys the application using rsync"""
    require("app_directory")
    write_version()
    project.rsync_project(local_dir="deploy/sale", remote_dir=env.app_directory, exclude=["*~", ".gitignore"])
    #filename = "deploy/config/%s-server.properties" % env.role
    #remotefile = "%s/deploy/config/server.properties" % env.app_directory
    #project.put(local_path=filename, remote_path=remotefile)

    #filename = "deploy/config/log4j.xml"
    #remotefile = "%s/deploy/config/log4j.xml" % env.app_directory
    #project.put(local_path=filename, remote_path=remotefile)

def start():
     require("app_directory")
     run("sudo supervisorctl start saleserver:*")
    
def stop():
     require("app_directory")
     run("sudo supervisorctl stop saleserver:*")
    
def restart():
     require("app_directory")
     run("sudo supervisorctl restart saleserver:*")
    
def info():
    require("app_directory")
    with cd(env.app_directory+"/deploy"):
         run('cat info')

def status():
     require("app_directory")
     run("supervisorctl status")

def build():
     local("ant")

def deploy():
     build()
     deploy_app()

def all():
     deploy()
     restart()
