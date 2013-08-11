package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 8/11/13
 * Time: 5:23 AM
 */
@Entity
@Table(name = "BRAND")
public class DBBrand implements Serializable {
    private static final long serialVersionUID = 9064844440481745868L;

    private Integer brandId_;
    private String brandName_;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRAND_ID", unique = true, nullable = false)
    public Integer getBrandId() {
        return brandId_;
    }

    public void setBrandId(Integer brandId) {
        brandId_ = brandId;
    }

    @Column(name = "BRAND_NAME", unique = true, nullable = false, length = 128)
    public String getBrandName() {
        return brandName_;
    }

    public void setBrandName(String brandName) {
        brandName_ = brandName;
    }
}
