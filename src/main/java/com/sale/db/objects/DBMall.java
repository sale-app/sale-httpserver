package com.sale.db.objects;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 30/07/13
 * Time: 8:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class DBMall
{
    private int mallId;
    private String mallName;
    private float latitude;
    private float longitude;

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
