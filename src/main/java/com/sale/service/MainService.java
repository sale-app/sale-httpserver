package com.sale.service;

import com.sale.vo.AreaVO;
import com.sale.vo.CityVO;
import com.sale.vo.MallVO;
import com.sale.vo.SaleVO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MainService
{
    public List<CityVO> getAllCities();

    public List<AreaVO> getAreaInCity(int cityId);

    public List<MallVO> getMallsInCityArea(int cityId, int areaId);

    public List<SaleVO> getSaleInCityAreaMall(int cityId, int areaId, int mallId);
}
