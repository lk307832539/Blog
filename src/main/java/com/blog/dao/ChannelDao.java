package com.blog.dao;

import com.blog.entity.Channel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelDao extends JpaRepository<Channel, Integer> {

}
