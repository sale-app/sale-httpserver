package com.sale.vo;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class AreaVO
{
    private int areaId;
    private String areaName;

    public AreaVO(int areaId, String areaName)
    {
        this.areaId = areaId;
        this.areaName = areaName;
    }

    public int getAreaId()
    {
        return areaId;
    }

    public void setAreaId(int areaId)
    {
        this.areaId = areaId;
    }

    public String getAreaName()
    {
        return areaName;
    }

    public void setAreaName(String areaName)
    {
        this.areaName = areaName;
    }
}
