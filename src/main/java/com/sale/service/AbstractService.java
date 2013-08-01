package com.sale.service;

import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 31/07/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractService
{
    private DBManager dbManager = DBManagerFactory.getDBManager();

    public DBManager getDbManager()
    {
        return dbManager;
    }
}
