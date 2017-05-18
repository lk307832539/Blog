package com.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2017/5/7.
 */
public abstract class BaseUserCategory implements Serializable {
    private int userCategoryId;
    private String categoryName;
    private String categoryDescription;
    private BaseUser user;

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

    public BaseUser getUser() {
        return user;
    }

    public void setUser(BaseUser user) {
        this.user = user;
    }
}
