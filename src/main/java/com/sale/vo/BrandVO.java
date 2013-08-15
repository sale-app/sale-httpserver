package com.sale.vo;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 10/08/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class BrandVO
{
    private int brandId;
    private String brandName;

    public BrandVO(int brandId, String brandName)
    {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public int getBrandId()
    {
        return brandId;
    }

    public void setBrandId(int brandId)
    {
        this.brandId = brandId;
    }

    public String getBrandName()
    {
        return brandName;
    }

    public void setBrandName(String brandName)
    {
        this.brandName = brandName;
    }
}
