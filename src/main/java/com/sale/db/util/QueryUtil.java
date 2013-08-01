package com.sale.db.util;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 10/04/13
 * Time: 9:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class QueryUtil
{
    public static final String GET_ALL_CITIES = "select * from CITY";
    public static final String GET_AREAS_IN_CITY = "select a.* from AREA a join CITY_AREA_MAPPING c on a.area_id=c.area_id where c.city_id=?";
    public static final String GET_MALLS_IN_CITY_AREA = "select m.* from MALL m join MALL_LOCATION_MAPPING ml on m.mall_id=ml.mall_id where ml.city_id=? and ml.area_id=?";
}
