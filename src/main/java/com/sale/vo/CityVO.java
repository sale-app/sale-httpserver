package com.sale.vo;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class CityVO
{
    private int cityId;
    private String cityName;

    public CityVO(int cityId, String cityName)
    {
        this.cityId = cityId;
        this.cityName = cityName;
    }

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
