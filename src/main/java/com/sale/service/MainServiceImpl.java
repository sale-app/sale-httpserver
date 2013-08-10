package com.sale.service;

import com.sale.util.DummyVOData;
import com.sale.vo.AreaVO;
import com.sale.vo.CityVO;
import com.sale.vo.MallVO;
import com.sale.vo.SaleVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainServiceImpl implements MainService
{
    public List<CityVO> getAllCities()
    {
        return DummyVOData.cityList;
    }

    public List<AreaVO> getAreaInCity(int cityId)
    {
        return DummyVOData.areaList;
    }

    public List<MallVO> getMallsInCityArea(int cityId, int areaId)
    {
        return DummyVOData.mallList;
    }

    public List<SaleVO> getSaleInCityAreaMall(int cityId, int areaId, int mallId)
    {
        return DummyVOData.saleList;
    }
}
