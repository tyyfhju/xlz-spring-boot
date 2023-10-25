package com.zjy.xlz.controller;

import com.zjy.xlz.entity.Photo;
import com.zjy.xlz.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
public class PhotoController {
    @Autowired
    private PhotoService photoService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<Photo> findAll(){
        return photoService.findAll();
    }
}
