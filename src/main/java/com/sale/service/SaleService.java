package com.sale.service;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 30/07/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */

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
    public String getLatestSale(@QueryParam("cityId") int cityId, @QueryParam("areaId") int areaId) {

        return null;
    }
}
