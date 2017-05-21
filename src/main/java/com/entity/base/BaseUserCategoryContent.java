package com.entity.base;

import com.entity.Content;
import com.entity.UserCategory;

import java.io.Serializable;

/**
 * 用户文章分组实体抽象类
 * Created by LK on 2017/5/7.
 */
public abstract class BaseUserCategoryContent implements Serializable {
    private int userCategoryId;
    private UserCategory userCategory;
    private Content content;

    public BaseUserCategoryContent() {
        super();
    }

    public int getUserCategoryId() {
        return userCategoryId;
    }

    public void setUserCategoryId(int userCategoryId) {
        this.userCategoryId = userCategoryId;
    }

    public UserCategory getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(UserCategory userCategory) {
        this.userCategory = userCategory;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
