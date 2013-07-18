package com.sale.db.objects;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 18/07/13
 * Time: 8:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBCity
{
    private int cityId;
    private String cityName;

    public int getCityId()
    {
        return cityId;
    }

    public void setCityId(int cityId)
    {
        this.cityId = cityId;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }
}
