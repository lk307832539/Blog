package com.dao;

import com.entity.Content;

import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
public abstract interface ContentDao {
    List<Content> getList();

    Content save(Content content);
}
