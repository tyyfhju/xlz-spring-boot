package com.zjy.xlz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjy.xlz.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CrudMapper extends BaseMapper<Message> {
}