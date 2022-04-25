package com.blog.dao;

import com.blog.entity.UserExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserExtDao extends JpaRepository<UserExt, Integer> {
}
