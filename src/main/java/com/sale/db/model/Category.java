package com.sale.db.model;

import org.hibernate.annotations.ForeignKey;

import javax.persistence.*;
import java.io.Serializable;

/**
 * User: shalabh.kulshreshtha
 * Date: 7/29/13
 * Time: 11:04 PM
 */
@Entity
@Table(name = "category", uniqueConstraints = {
        @UniqueConstraint(columnNames = "CATEGORY_NAME")
})
public class Category implements Serializable {
    private static final long serialVersionUID = -8452393188431340095L;

    private Integer categoryId_;
    private String categoryName_;
    private Category parentCategory_;

    public Category() {
    }

    public Category(Integer categoryId, String categoryName, Category parentCategory) {
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
    @ForeignKey(name = "CATEGORY_PARENT_CATEGORY_FK")
    @Column(name = "PARENT_CATEGORY_ID")
    public Category getParentCategory() {
        return parentCategory_;
    }

    public void setParentCategory(Category parentCategory) {
        parentCategory_ = parentCategory;
    }
}
