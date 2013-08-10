package com.sale.controller;

import com.sale.vo.MallVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 06/08/13
 * Time: 8:46 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/getmalls")
public class MallController extends AbstractController
{
    private static Logger logger = LoggerFactory.getLogger(MallController.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getMallsInCityArea(@QueryParam("cityId") int cityId, @QueryParam("areaId") int areaId) {

        logger.debug("Fetching malls in cityId [ " + cityId + "], areaId [" + areaId + "]");

        List<MallVO> mallList = getMainService().getMallsInCityArea(cityId, areaId);
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        if(mallList.size() > 0)
        {
            JSONObject obj = new JSONObject();
            obj.put("mallId", -1);
            obj.put("mallName", "All Stores");
            array.add(obj);
        }

        for(int i=0;i<mallList.size();i++)
        {
            MallVO mall = mallList.get(i);
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
