package com.sale.db.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "MALL", uniqueConstraints = {
        @UniqueConstraint(columnNames = "MALL_NAME")
})
public class Mall implements Serializable {
    private static final long serialVersionUID = 6800062778577507491L;

    private Integer mallId_;
    private String mallName_;
    private double latitude_;
    private double longitude_;

    public Mall() {
    }

    public Mall(Integer mallId, String mallName, double latitude, double longitude) {
        mallId_ = mallId;
        mallName_ = mallName;
        latitude_ = latitude;
        longitude_ = longitude;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALL_ID", unique = true, nullable = false)
    public Integer getMallId() {
        return mallId_;
    }

    public void setMallId(Integer mallId) {
        mallId_ = mallId;
    }

    @Column(name = "MALL_NAME", unique = true, nullable = false, length = 50)
    public String getMallName() {
        return mallName_;
    }

    public void setMallName(String mallName) {
        mallName_ = mallName;
    }

    @Column(name = "LATITUDE", nullable = false, precision = 13, scale = 8)
    public double getLatitude() {
        return latitude_;
    }

    public void setLatitude(double latitude) {
        latitude_ = latitude;
    }

    @Column(name = "LONGITUDE", nullable = false, precision = 13, scale = 8)
    public double getLongitude() {
        return longitude_;
    }

    public void setLongitude(double longitude) {
        longitude_ = longitude;
    }
}
