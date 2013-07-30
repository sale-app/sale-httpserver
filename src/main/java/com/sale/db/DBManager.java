package com.sale.db;

import com.sale.db.objects.DBArea;
import com.sale.db.objects.DBCity;
import com.sale.db.objects.DBMall;

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

    public List<DBArea> getAreaInCity(int cityId);

    public List<DBMall> getMallsInCityArea(int cityId, int areaId);
}
