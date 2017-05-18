package com.service.impl;

import com.dao.ContentDao;
import com.entity.Content;
import com.service.ContentMng;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
@Service
public class ContentMngImpl implements ContentMng {

    @Resource
    private ContentDao contentDao;

    @Override
    public List<Content> getContentList() {
        return contentDao.getContentList();
    }
}
