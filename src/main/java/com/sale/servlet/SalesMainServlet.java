package com.sale.servlet;

import com.sale.config.SaleConfig;
import com.sale.context.ContextManager;
import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;
import com.sale.db.objects.DBCity;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 28/03/13
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class SalesMainServlet extends HttpServlet
{
    Logger logger = LoggerFactory.getLogger(SalesMainServlet.class.getCanonicalName());

    public void init(ServletConfig config) throws javax.servlet.ServletException
    {
        super.init(config);
        logger.info("Initializing SalesMainServlet");
        SaleConfig.getInstance().loadProperties("sale.properties");
        ContextManager.getInstance();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String requestUri = request.getRequestURI();
        String pathInfo = request.getPathInfo();
        logger.info("requestUri=" + requestUri + ", pathInfo=" + pathInfo);

        DBManager dbManager = DBManagerFactory.getDBManager();
        List<DBCity> cities = dbManager.getAllCities();
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i=0;i<cities.size();i++)
        {
            DBCity city = cities.get(i);
            JSONObject obj = new JSONObject();
            obj.put("cityId", city.getCityId());
            obj.put("cityName", city.getCityName());
            array.add(obj);
        }
        object.put("items", array);
        response.getOutputStream().write(object.toJSONString().getBytes());


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String requestUri = request.getRequestURI();
        String pathInfo = request.getPathInfo();
        logger.info("requestUri=" + requestUri + ", pathInfo=" + pathInfo);
    }
}
