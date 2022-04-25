package com.blog.entity;

import com.blog.entity.base.BaseUserExt;

import javax.persistence.Entity;

/**
 * 用户 拓展类
 * Created by LK on 2017/5/7.
 */
@Entity
public class UserExt extends BaseUserExt {
    private static final long serialVersionUID = 1L;

    public UserExt() {
        super();
    }
}
