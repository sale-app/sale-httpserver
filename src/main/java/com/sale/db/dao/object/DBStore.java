package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 8/11/13
 * Time: 5:08 AM
 */
@Entity
@Table(name = "STORE")
public class DBStore implements Serializable {
    private static final long serialVersionUID = -6219555766276957109L;

    private Integer storeId_;
    private String storeName_;
    private String address_;
    private String phoneNumber_;
    private DBLocation location_;
    private DBMall mall_;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STORE_ID", unique = true, nullable = false)
    public Integer getStoreId() {
        return storeId_;
    }

    public void setStoreId(Integer storeId) {
        storeId_ = storeId;
    }

    @Column(name = "STORE_NAME", unique = true, nullable = false, length = 128)
    public String getStoreName() {
        return storeName_;
    }

    public void setStoreName(String storeName) {
        storeName_ = storeName;
    }

    @Column(name = "ADDRESS", unique = true, nullable = false, length = 256)
    public String getAddress() {
        return address_;
    }

    public void setAddress(String address) {
        address_ = address;
    }

    @Column(name = "PHONE_NUMBER", unique = true, nullable = false, length = 128)
    public String getPhoneNumber() {
        return phoneNumber_;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber_ = phoneNumber;
    }

    @ManyToOne(targetEntity = DBLocation.class)
    @JoinColumn(name = "LOCATION_ID", referencedColumnName = "LOCATION_ID", nullable = false)
    public DBLocation getLocation() {
        return location_;
    }

    public void setLocation(DBLocation location) {
        location_ = location;
    }

    @ManyToOne(targetEntity = DBMall.class)
    @JoinColumn(name = "MALL_ID", referencedColumnName = "MALL_ID")
    public DBMall getMall() {
        return mall_;
    }

    public void setMall(DBMall mall) {
        mall_ = mall;
    }
}
