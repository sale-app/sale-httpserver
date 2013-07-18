package com.sale.db.mysql;

import com.sale.db.DBManager;
import com.sale.db.objects.DBCity;
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

    /*@Transactional
    public void getAllCities()
    {
        //this.jdbcTemplate.query(QueryUtil.GET_ALL_CITIES);
    }*/

}
