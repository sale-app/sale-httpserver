package com.sale.vo;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class MallVO
{
    private int mallId;
    private String mallName;
    private float latitude;
    private float longitude;

    public MallVO(int mallId, String mallName, float latitude, float longitude)
    {
        this.mallId = mallId;
        this.mallName = mallName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getMallId()
    {
        return mallId;
    }

    public void setMallId(int mallId)
    {
        this.mallId = mallId;
    }

    public String getMallName()
    {
        return mallName;
    }

    public void setMallName(String mallName)
    {
        this.mallName = mallName;
    }

    public float getLatitude()
    {
        return latitude;
    }

    public void setLatitude(float latitude)
    {
        this.latitude = latitude;
    }

    public float getLongitude()
    {
        return longitude;
    }

    public void setLongitude(float longitude)
    {
        this.longitude = longitude;
    }
}
