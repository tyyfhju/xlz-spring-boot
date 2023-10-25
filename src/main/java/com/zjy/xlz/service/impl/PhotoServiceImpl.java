package com.zjy.xlz.service.impl;

import com.zjy.xlz.entity.Photo;
import com.zjy.xlz.mapper.PhotoMapper;
import com.zjy.xlz.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoServiceImpl implements PhotoService {

    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public List<Photo> findAll(){
        return photoMapper.findAll();
    }
}