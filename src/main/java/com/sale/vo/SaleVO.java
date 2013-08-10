package com.sale.vo;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 10/08/13
 * Time: 5:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class SaleVO
{
    private int saleId;
    private String offer;
    private String startDate;
    private String endDate;
    private StoreVO storeDetails;

    public SaleVO(int saleId, String offer, String startDate, String endDate, StoreVO storeDetails)
    {
        this.saleId = saleId;
        this.offer = offer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.storeDetails = storeDetails;
    }

    public int getSaleId()
    {
        return saleId;
    }

    public void setSaleId(int saleId)
    {
        this.saleId = saleId;
    }

    public String getOffer()
    {
        return offer;
    }

    public void setOffer(String offer)
    {
        this.offer = offer;
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
    }

    public String getEndDate()
    {
        return endDate;
    }

    public void setEndDate(String endDate)
    {
        this.endDate = endDate;
    }

    public StoreVO getStoreDetails()
    {
        return storeDetails;
    }

    public void setStoreDetails(StoreVO storeDetails)
    {
        this.storeDetails = storeDetails;
    }

}
