package com.service.impl;

import com.dao.ContentExtDao;
import com.entity.ContentExt;
import com.service.ContentExtMng;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by LK on 2017/5/29.
 */
@Service
@Transactional
public class ContentExtMngImpl implements ContentExtMng {
    @Resource
    private ContentExtDao contentExtDao;

    @Override
    public ContentExt save(ContentExt contentExt) {
        return contentExtDao.save(contentExt);
    }
}
