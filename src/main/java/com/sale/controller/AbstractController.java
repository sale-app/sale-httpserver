package com.sale.controller;

import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;
import com.sale.service.MainService;
import com.sale.service.MainServiceImpl;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 31/07/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class AbstractController
{
    private static MainService mainService = new MainServiceImpl();

    public MainService getMainService()
    {
        return mainService;
    }
}
