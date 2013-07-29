package com.sale.db.model;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/30/13
 * Time: 3:40 AM
 */
@Entity
@Table(name = "MALL_LOCATION_MAPPING")
public class MallLocationMapping implements Serializable {
    private static final long serialVersionUID = -5796850043874707953L;

    private City city_;
    private Area area_;
    private Mall mall_;

    public MallLocationMapping() {
    }

    public MallLocationMapping(City city, Area area, Mall mall) {
        city_ = city;
        area_ = area;
        mall_ = mall;
    }

    @ManyToOne
    @ForeignKey(name = "AMM_CITY_FK")
    @Column(name = "CITY_ID", nullable = false)
    public City getCity() {
        return city_;
    }

    public void setCity(City city) {
        city_ = city;
    }

    @ManyToOne
    @ForeignKey(name = "AMM_AREA_FK")
    @Column(name = "AREA_ID", nullable = false)
    public Area getArea() {
        return area_;
    }

    public void setArea(Area area) {
        area_ = area;
    }

    @ManyToOne
    @ForeignKey(name = "AMM_MALL_FK")
    @Column(name = "MALL_ID", nullable = false)
    public Mall getMall() {
        return mall_;
    }

    public void setMall(Mall mall) {
        mall_ = mall;
    }
}
