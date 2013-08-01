package com.sale.service;

import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;
import com.sale.db.objects.DBArea;
import com.sale.db.objects.DBCity;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 29/07/13
 * Time: 11:03 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/arealist")
public class AreaService extends AbstractService
{
    private static Logger logger = LoggerFactory.getLogger(SaleService.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getAreaListInCity(@QueryParam("cityId") int cityId) {

        logger.info("Fetching areas in cityId [" + cityId + "]");
        List<DBArea> areaList = getDbManager().getAreaInCity(cityId);
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i=0;i<areaList.size();i++)
        {
            DBArea area = areaList.get(i);
            JSONObject obj = new JSONObject();
            obj.put("areaId", area.getAreaId());
            obj.put("areaName", area.getAreaName());
            array.add(obj);
        }
        object.put("items", array);
        return object.toJSONString();
    }
}
