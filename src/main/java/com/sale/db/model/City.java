package com.sale.db.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "CITY", uniqueConstraints = {
        @UniqueConstraint(columnNames = "CITY_NAME")
})
public class City implements Serializable {
    private static final long serialVersionUID = 1450667898474403084L;

    private Integer cityId_;
    private String cityName_;

    public City() {
    }

    public City(Integer cityId, String cityName) {
        cityId_ = cityId;
        cityName_ = cityName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CITY_ID", unique = true, nullable = false)
    public Integer getCityId() {
        return cityId_;
    }

    public void setCityId(Integer cityId) {
        cityId_ = cityId;
    }

    @Column(name = "CITY_NAME", unique = true, nullable = false, length = 50)
    public String getCityName() {
        return cityName_;
    }

    public void setCityName(String cityName) {
        cityName_ = cityName;
    }
}
