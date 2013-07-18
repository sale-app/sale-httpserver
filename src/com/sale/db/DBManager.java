package com.sale.db;

import com.sale.db.objects.DBCity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 08/04/13
 * Time: 7:19 PM
 * To change this template use File | Settings | File Templates.
 */
public interface DBManager
{
    public List<DBCity> getAllCities();
}
