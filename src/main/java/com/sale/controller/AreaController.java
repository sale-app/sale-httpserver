package com.sale.controller;

import com.sale.vo.AreaVO;
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
public class AreaController extends AbstractController
{
    private static Logger logger = LoggerFactory.getLogger(AreaController.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getAreaListInCity(@QueryParam("cityId") int cityId) {

        logger.debug("Fetching areas in cityId [" + cityId + "]");
        List<AreaVO> areaList = getMainService().getAreaInCity(cityId);
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        if(areaList.size() > 0)
        {
            JSONObject obj = new JSONObject();
            obj.put("areaId", -1);
            obj.put("areaName", "All");
            array.add(obj);
        }
        for(int i=0;i<areaList.size();i++)
        {
            AreaVO area = areaList.get(i);
            JSONObject obj = new JSONObject();
            obj.put("areaId", area.getAreaId());
            obj.put("areaName", area.getAreaName());
            array.add(obj);
        }

        object.put("items", array);
        return object.toJSONString();
    }
}
