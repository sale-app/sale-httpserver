package com.sale.vo;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 10/08/13
 * Time: 5:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class StoreVO
{
    private int storeId;
    private String storeName;
    private String address;
    private String phoneNumber;
    private float latitude;
    private float longitude;

    private List<BrandVO> brandDetails;
    private MallVO mallDetails;

    public StoreVO(int storeId, String storeName, String address, String phoneNumber,
                   float latitude, float longitude, List<BrandVO> brandDetails, MallVO mallDetails)
    {
        this.storeId = storeId;
        this.storeName = storeName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.latitude = latitude;
        this.longitude = longitude;
        this.brandDetails = brandDetails;
        this.mallDetails = mallDetails;
    }

    public int getStoreId()
    {
        return storeId;
    }

    public void setStoreId(int storeId)
    {
        this.storeId = storeId;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public void setStoreName(String storeName)
    {
        this.storeName = storeName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
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

    public List<BrandVO> getBrandDetails()
    {
        return brandDetails;
    }

    public void setBrandDetails(List<BrandVO> brandDetails)
    {
        this.brandDetails = brandDetails;
    }

    public MallVO getMallDetails()
    {
        return mallDetails;
    }

    public void setMallDetails(MallVO mallDetails)
    {
        this.mallDetails = mallDetails;
    }

    public String getMallName()
    {
        if(mallDetails == null)
            return "";

        return mallDetails.getMallName();
    }

    public String getBrandString()
    {
        if(brandDetails == null)
            return "";

        StringBuilder builder = new StringBuilder();
        int count = 0;
        for(BrandVO brand : brandDetails)
        {
            if(count > 0)
                builder.append(", ");

            builder.append(brand.getBrandName());
        }
        return builder.toString();
    }
}
