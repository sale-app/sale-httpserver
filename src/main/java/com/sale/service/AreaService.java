package com.sale.service;

import com.sale.db.DBManager;
import com.sale.db.DBManagerFactory;
import com.sale.db.objects.DBArea;
import com.sale.db.objects.DBCity;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
public class AreaService
{
    @GET
    @Produces("application/json")
    public String getAreaListInCity(@QueryParam("cityId") int cityId) {

        System.out.println("cityId = " + cityId);
        DBManager dbManager = DBManagerFactory.getDBManager();
        List<DBArea> areaList = dbManager.getAreaInCity(cityId);
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
