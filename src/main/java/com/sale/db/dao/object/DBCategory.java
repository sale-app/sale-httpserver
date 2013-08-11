package com.sale.db.dao.object;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "CATEGORY")
public class DBCategory implements Serializable {
    private static final long serialVersionUID = -8452393188431340095L;

    private Integer categoryId_;
    private String categoryName_;
    private DBCategory parentCategory_;

    public DBCategory() {
    }

    public DBCategory(Integer categoryId, String categoryName, DBCategory parentCategory) {
        categoryId_ = categoryId;
        categoryName_ = categoryName;
        parentCategory_ = parentCategory;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CATEGORY_ID", unique = true, nullable = false)
    public Integer getCategoryId() {
        return categoryId_;
    }

    public void setCategoryId(Integer categoryId) {
        categoryId_ = categoryId;
    }

    @Column(name = "CATEGORY_NAME", unique = true, nullable = false, length = 50)
    public String getCategoryName() {
        return categoryName_;
    }

    public void setCategoryName(String categoryName) {
        categoryName_ = categoryName;
    }

    @ManyToOne
    @JoinColumn(name = "PARENT_CATEGORY_ID", referencedColumnName = "CATEGORY_ID")
    public DBCategory getParentCategory() {
        return parentCategory_;
    }

    public void setParentCategory(DBCategory parentCategory) {
        parentCategory_ = parentCategory;
    }
}
