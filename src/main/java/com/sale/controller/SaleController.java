package com.sale.controller;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 30/07/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */

import com.sale.vo.SaleVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/getlatestsales")
public class SaleController extends AbstractController
{
    private static Logger logger = LoggerFactory.getLogger(SaleController.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getLatestSale(@QueryParam("cityId") int cityId, @QueryParam("areaId") int areaId, @QueryParam("mallId") int mallId) {

        logger.debug("Fetching sales in cityId [ " + cityId + "], areaId [" + areaId + "], mallId [" + mallId + "]");

        List<SaleVO> saleList = getMainService().getSaleInCityAreaMall(cityId, areaId, mallId);
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i=0;i<saleList.size();i++)
        {
            SaleVO sale = saleList.get(i);
            JSONObject obj = new JSONObject();
            obj.put("saleId", sale.getSaleId());
            obj.put("offer", sale.getOffer());
            obj.put("storeId", sale.getStoreDetails().getStoreId());
            obj.put("brandString", sale.getStoreDetails().getBrandString());
            obj.put("mallName", sale.getStoreDetails().getMallName());
            obj.put("storeName", sale.getStoreDetails().getStoreName());
            obj.put("storeAddress", sale.getStoreDetails().getAddress());
            obj.put("storePhoneNumber", sale.getStoreDetails().getPhoneNumber());
            obj.put("latitude", sale.getStoreDetails().getLatitude());
            obj.put("longitude", sale.getStoreDetails().getLongitude());
            array.add(obj);
        }
        object.put("items", array);
        return object.toJSONString();
    }
}
