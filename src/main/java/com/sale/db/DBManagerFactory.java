package com.sale.db;

import com.sale.context.ContextManager;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 18/07/13
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBManagerFactory
{
    public static DBManager getDBManager()
    {
        return ContextManager.getInstance().getBean(DBManager.class);
    }
}
