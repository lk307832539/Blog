package com.entity.base;

import java.io.Serializable;

/**
 * Created by LK on 2017/5/7.
 */
public abstract class BaseUserCategoryContent implements Serializable {
    private int userCategoryId;
    private BaseUserCategory userCategory;
    private BaseContent content;

    public BaseUserCategoryContent() {
        super();
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public BaseUserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(BaseUserCategory userCategory) {
        this.userCategory = userCategory;
    }

    public BaseContent getContent() {
        return content;
    }

    public void setContent(BaseContent content) {
        this.content = content;
    }
}
