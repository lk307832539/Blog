package com.blog.dao;

import com.blog.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by LK on 2017/5/17.
 */
@Repository
public interface ContentDao extends JpaRepository<Content, Integer> {

}
