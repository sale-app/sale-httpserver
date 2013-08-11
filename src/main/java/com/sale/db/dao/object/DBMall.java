package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "MALL")
public class DBMall implements Serializable {
    private static final long serialVersionUID = -2130276611711161206L;

    private Integer mallId_;
    private String mallName_;
    private DBLocation location_;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALL_ID", unique = true, nullable = false)
    public Integer getMallId() {
        return mallId_;
    }

    public void setMallId(Integer mallId) {
        mallId_ = mallId;
    }

    @Column(name = "MALL_NAME", unique = true, nullable = false, length = 128)
    public String getMallName() {
        return mallName_;
    }

    public void setMallName(String mallName) {
        mallName_ = mallName;
    }

    @ManyToOne(targetEntity = DBLocation.class)
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID", nullable = false)
    public DBLocation getLocation() {
        return location_;
    }

    public void setLocation(DBLocation location) {
        location_ = location;
    }
}
