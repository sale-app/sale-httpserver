package com.sale.service;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 30/07/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */

import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;
import com.sale.db.objects.DBArea;
import com.sale.db.objects.DBMall;
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
public class SaleService extends AbstractService
{
    private static Logger logger = LoggerFactory.getLogger(SaleService.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getMallsInCityArea(@QueryParam("cityId") int cityId, @QueryParam("areaId") int areaId) {

        logger.debug("Fetching malls in cityId [ " + cityId + "], areaId [" + areaId + "]");

        List<DBMall> mallList = getDbManager().getMallsInCityArea(cityId, areaId);
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i=0;i<mallList.size();i++)
        {
            DBMall mall = mallList.get(i);
            JSONObject obj = new JSONObject();
            obj.put("mallId", mall.getMallId());
            obj.put("mallName", mall.getMallName());
            obj.put("latitude", mall.getLatitude());
            obj.put("longitude", mall.getLongitude());
            array.add(obj);
        }
        object.put("items", array);
        return object.toJSONString();
    }
}
