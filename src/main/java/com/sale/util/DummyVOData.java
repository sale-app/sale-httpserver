package com.sale.util;

import com.sale.vo.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 09/08/13
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class DummyVOData
{
    public static final CityVO delhi = new CityVO(1,"Delhi");
    public static final CityVO gurgaon = new CityVO(2,"Gurgaon");
    public static final CityVO noida = new CityVO(3,"Noida");

    public static final AreaVO sector49 = new AreaVO(1,"Sector 49");
    public static final AreaVO sector18 = new AreaVO(2,"Sector 18");
    public static final AreaVO laxmiNagar = new AreaVO(1,"Laxminagar");

    public static final MallVO omaxeCityCenter = new MallVO(1, "Omaxe City Center", 29.05877570F,76.08560100F);
    public static final MallVO theGreatIndiaPlace = new MallVO(2, "The Great India Place", 28.56756230F,77.32569070F);
    public static final MallVO dtStarMall = new MallVO(3, "DT Star Mall", 28.4632450F,77.0578855F);
    public static final MallVO v3sMall = new MallVO(4, "V3S Mall", 28.63530800F,77.22496000F);

    public static final BrandVO adidas = new BrandVO(1, "Adidas");
    public static final BrandVO nike = new BrandVO(2, "Nike");
    public static final BrandVO reebok = new BrandVO(3, "Reebok");
    public static final BrandVO puma = new BrandVO(4, "Puma");

    public static final List<BrandVO> brandList1 = new ArrayList<BrandVO>();
    public static final List<BrandVO> brandList2 = new ArrayList<BrandVO>();
    public static final List<BrandVO> brandList3 = new ArrayList<BrandVO>();
    public static final List<BrandVO> brandList4 = new ArrayList<BrandVO>();

    static {
        brandList1.add(adidas);
        brandList2.add(puma);
        brandList2.add(nike);
        brandList3.add(adidas);
        brandList3.add(reebok);
        brandList4.add(adidas);
        brandList4.add(nike);
        brandList4.add(reebok);
    }

    public static final StoreVO store1 = new StoreVO(1,"Test Store 1", "Test Address 1", "xxxxxxxxxxxxx", 29.05877570F,76.08560100F, brandList1, omaxeCityCenter);
    public static final StoreVO store2 = new StoreVO(2,"Test Store 2", "Test Address 2", "xxxxxxxxxxxxx", 28.56756230F,77.32569070F, brandList2, theGreatIndiaPlace);
    public static final StoreVO store3 = new StoreVO(3,"Test Store 3", "Test Address 3", "xxxxxxxxxxxxx", 28.4632450F,77.0578855F, brandList3, dtStarMall);
    public static final StoreVO store4 = new StoreVO(4,"Test Store 4", "Test Address 4", "xxxxxxxxxxxxx", 28.63530800F,77.22496000F, brandList4, v3sMall);

    public static final SaleVO sale1 = new SaleVO(1,"50% Off", "01-08-2013","31-08-2013",store1);
    public static final SaleVO sale2 = new SaleVO(1,"30% Off", "01-08-2013","31-08-2013",store2);
    public static final SaleVO sale3 = new SaleVO(1,"20% Off", "01-08-2013","31-08-2013",store3);
    public static final SaleVO sale4 = new SaleVO(1,"10% Off", "01-08-2013","31-08-2013",store4);

    public static final List<CityVO> cityList = new ArrayList<CityVO>();
    public static final List<AreaVO> areaList = new ArrayList<AreaVO>();
    public static final List<MallVO> mallList = new ArrayList<MallVO>();
    public static final List<SaleVO> saleList = new ArrayList<SaleVO>();

    static
    {
        cityList.add(delhi);
        cityList.add(gurgaon);
        cityList.add(noida);

        areaList.add(sector49);
        areaList.add(sector18);
        areaList.add(laxmiNagar);

        mallList.add(omaxeCityCenter);
        mallList.add(theGreatIndiaPlace);
        mallList.add(dtStarMall);
        mallList.add(v3sMall);

        saleList.add(sale1);
        saleList.add(sale2);
        saleList.add(sale3);
        saleList.add(sale4);

    }
}


