package com.sale.db.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "AREA", uniqueConstraints = {
        @UniqueConstraint(columnNames = "AREA_NAME")
})
public class Area implements Serializable {
    private static final long serialVersionUID = -5477366743442013119L;

    private Integer areaId_;
    private String areaName_;

    public Area() {
    }

    public Area(Integer areaId, String areaName) {
        areaId_ = areaId;
        areaName_ = areaName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AREA_ID", unique = true, nullable = false)
    public Integer getAreaId() {
        return areaId_;
    }

    public void setAreaId(Integer areaId) {
        areaId_ = areaId;
    }

    @Column(name = "AREA_NAME", unique = true, nullable = false, length = 50)
    public String getAreaName() {
        return areaName_;
    }

    public void setAreaName(String areaName) {
        areaName_ = areaName;
    }
}
