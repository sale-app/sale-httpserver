package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: shalabh.kulshreshtha
 * Date: 8/11/13
 * Time: 5:23 AM
 */
@Entity
@Table(name = "SALE")
public class DBSale implements Serializable {
    private static final long serialVersionUID = -7677520630942169628L;

    private Integer saleId_;
    private DBStore store_;
    private String offer_;
    private Date startDate_;
    private Date endDate_;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SALE_ID", unique = true, nullable = false)
    public Integer getSaleId() {
        return saleId_;
    }

    public void setSaleId(Integer saleId) {
        saleId_ = saleId;
    }

    @ManyToOne(targetEntity = DBStore.class)
    @JoinColumn(name = "STORE_ID", referencedColumnName = "STORE_ID")
    public DBStore getStore() {
        return store_;
    }

    public void setStore(DBStore store) {
        store_ = store;
    }

    @Column(name = "OFFER", nullable = false, length = 1024)
    public String getOffer() {
        return offer_;
    }

    public void setOffer(String offer) {
        offer_ = offer;
    }

    @Column(name = "START_DATE", nullable = false)
    public Date getStartDate() {
        return startDate_;
    }

    public void setStartDate(Date startDate) {
        startDate_ = startDate;
    }

    @Column(name = "END_DATE", nullable = false)
    public Date getEndDate() {
        return endDate_;
    }

    public void setEndDate(Date endDate) {
        endDate_ = endDate;
    }
}
