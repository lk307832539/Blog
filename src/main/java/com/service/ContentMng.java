package com.service;

import com.entity.Content;

import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
public abstract interface ContentMng {
    List<Content> getList();

    Content save(Content content);

    Content getContentById(Integer id);
}
