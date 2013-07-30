package com.sale.db.mysql;

import com.sale.db.DBManager;
import com.sale.db.objects.DBArea;
import com.sale.db.objects.DBCity;
import com.sale.db.objects.DBMall;
import com.sale.db.util.QueryUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: manusrivastava
 * Date: 08/04/13
 * Time: 7:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class MySqlDBManager implements DBManager
{
    private static Logger logger = LoggerFactory.getLogger(MySqlDBManager.class.getCanonicalName());

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<DBCity> getAllCities()
    {
        Connection conn = null;
        PreparedStatement st = null;
        List<DBCity> cityList = null;
        try {
            conn = DataSourceUtils.getConnection(dataSource);
            st = conn.prepareStatement(QueryUtil.GET_ALL_CITIES);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                if(cityList == null)
                    cityList = new ArrayList<DBCity>();

                int cityId = rs.getInt("city_id");
                String cityName = rs.getString("city_name");
                DBCity dbCity = new DBCity();
                dbCity.setCityId(cityId);
                dbCity.setCityName(cityName);
                cityList.add(dbCity);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            try
            {
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return cityList;
    }

    public List<DBArea> getAreaInCity(int cityId)
    {
        Connection conn = null;
        PreparedStatement st = null;
        List<DBArea> areaList = null;
        try {
            conn = DataSourceUtils.getConnection(dataSource);
            st = conn.prepareStatement(QueryUtil.GET_AREAS_IN_CITY);
            st.setInt(1, cityId);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                if(areaList == null)
                    areaList = new ArrayList<DBArea>();

                int areaId = rs.getInt("area_id");
                String areaName = rs.getString("area_name");
                DBArea dbArea = new DBArea();
                dbArea.setAreaId(areaId);
                dbArea.setAreaName(areaName);
                areaList.add(dbArea);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            try
            {
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return areaList;
    }

    public List<DBMall> getMallsInCityArea(int cityId, int areaId)
    {
        Connection conn = null;
        PreparedStatement st = null;
        List<DBMall> mallList = null;
        try {
            conn = DataSourceUtils.getConnection(dataSource);
            st = conn.prepareStatement(QueryUtil.GET_MALLS_IN_CITY_AREA);
            st.setInt(1, cityId);
            st.setInt(2, areaId);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                if(mallList == null)
                    mallList = new ArrayList<DBMall>();

                int mallId = rs.getInt("mall_id");
                String mallName = rs.getString("mall_name");
                float latitude = rs.getFloat("latitude");
                float longitude = rs.getFloat("longitude");
                DBMall dbMall = new DBMall();
                dbMall.setMallId(mallId);
                dbMall.setMallName(mallName);
                dbMall.setLatitude(latitude);
                dbMall.setLongitude(longitude);
                mallList.add(dbMall);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }  catch (Exception e) {
            e.printStackTrace();
        } finally {
            try
            {
                conn.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        return mallList;
    }

    /*@Transactional
    public void getAllCities()
    {
        //this.jdbcTemplate.query(QueryUtil.GET_ALL_CITIES);
    }*/

}
