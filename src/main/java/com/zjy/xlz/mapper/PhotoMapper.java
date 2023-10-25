package com.zjy.xlz.mapper;

import com.zjy.xlz.entity.Photo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PhotoMapper {
    @Select("select * from photo")
    List<Photo> findAll();
}