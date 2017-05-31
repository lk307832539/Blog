package com.service.impl;

import com.dao.ContentDao;
import com.entity.Content;
import com.service.ContentMng;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
@Service
@Transactional
public class ContentMngImpl implements ContentMng {

    @Resource
    private ContentDao contentDao;

    @Override
    public List<Content> getList() {
        return contentDao.getList();
    }

    @Override
    public Content save(Content content) {
        return contentDao.save(content);
    }
}
