package com.zjy.xlz.controller;

import com.zjy.xlz.entity.User;
import com.zjy.xlz.pojo.CommonResp;
import com.zjy.xlz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public CommonResp register(@RequestBody User req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp resp = new CommonResp<>();
        userService.register(req);
        System.out.println(req);
        return resp;
    }

    @PostMapping("login")
    public CommonResp login(@RequestBody User req) {
        req.setPassword(DigestUtils.md5DigestAsHex(req.getPassword().getBytes()));
        CommonResp resp = new CommonResp<>();
        User loginResp = userService.login(req);
        resp.setContent(loginResp);
        System.out.println(loginResp);
        return resp;
    }
}