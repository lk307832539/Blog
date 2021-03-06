package com.entity.base;

import com.entity.User;

import java.io.Serializable;

/**
 * 用户分组实体抽象类
 * Created by LK on 2017/5/7.
 */
public abstract class BaseUserCategory implements Serializable {
    private int userCategoryId;
    private String categoryName;
    private String categoryDescription;
    private User user;

    public BaseUserCategory() {
        super();
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
