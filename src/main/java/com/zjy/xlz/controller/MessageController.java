package com.zjy.xlz.controller;

import com.zjy.xlz.entity.Message;
import com.zjy.xlz.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
public class MessageController {

    @Autowired
    private MessageMapper messageMapper;

    @RequestMapping("/getMessages")
    private List<Message> getMessages() {
        return messageMapper.findAll();//遍历所有留言
    }

    @PostMapping("/postMessage")
    private String postMessage(@RequestParam String author, @RequestParam String message) {
        if(author.replaceAll(" ","").equals("") || message.replaceAll(" ","").equals("")) {
            return "filed";
        }//判断名字和留言是否为空
        messageMapper.save(new Message((long) (messageMapper.findAll().size() + 1),author,message,new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())));//保存留言到数据库
        return "success";
    }
}