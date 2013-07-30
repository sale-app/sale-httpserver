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
    public static final String GET_AREAS_IN_CITY = "select * from AREA where area_id in (select area_id from CITY_AREA_MAPPING where city_id=?)";
    public static final String GET_MALLS_IN_CITY_AREA = "select * from MALL where mall_id in (select mall_id from MALL_LOCATION_MAPPING where city_id=? and area_id=?)";
}
