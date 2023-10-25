package com.zjy.xlz.mapper;

import com.zjy.xlz.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MessageMapper extends JpaRepository<Message, Long> {
}