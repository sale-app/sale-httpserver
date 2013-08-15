package com.sale.controller;


import com.sale.vo.CityVO;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 23/07/13
 * Time: 8:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Path("/citylist")
public class CityController extends AbstractController
{
    private static Logger logger = LoggerFactory.getLogger(CityController.class.getCanonicalName());

    @GET
    @Produces("application/json")
    public String getAllCities() {

        logger.debug("Fetching all cities");

        List<CityVO> cities = getMainService().getAllCities();
        JSONObject object = new JSONObject();
        JSONArray array = new JSONArray();
        for(int i=0;i<cities.size();i++)
        {
            CityVO city = cities.get(i);
            JSONObject obj = new JSONObject();
            obj.put("cityId", city.getCityId());
            obj.put("cityName", city.getCityName());
            array.add(obj);
        }
        object.put("items", array);
        return object.toJSONString();
    }
}
