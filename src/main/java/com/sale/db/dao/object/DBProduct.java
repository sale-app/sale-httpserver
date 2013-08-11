package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 8/11/13
 * Time: 5:23 AM
 */
@Entity
@Table(name = "PRODUCT")
public class DBProduct implements Serializable {
    private static final long serialVersionUID = -2695343883473273499L;

    private Integer productId_;
    private String productName_;
    private DBCategory category_;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRODUCT_ID", unique = true, nullable = false)
    public Integer getProductId() {
        return productId_;
    }

    public void setProductId(Integer productId) {
        productId_ = productId;
    }

    @Column(name = "PRODUCT_NAME", unique = true, nullable = false, length = 128)
    public String getProductName() {
        return productName_;
    }

    public void setProductName(String productName) {
        productName_ = productName;
    }

    @ManyToOne(targetEntity = DBCategory.class)
    @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    public DBCategory getCategory() {
        return category_;
    }

    public void setCategory(DBCategory category) {
        category_ = category;
    }
}
