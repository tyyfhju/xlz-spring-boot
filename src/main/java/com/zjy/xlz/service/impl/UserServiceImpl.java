package com.zjy.xlz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjy.xlz.entity.User;
import com.zjy.xlz.mapper.UserMapper;
import com.zjy.xlz.service.UserService;
import com.zjy.xlz.utils.CopyUtil;
import com.zjy.xlz.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper sysUserMapper;

    @Autowired
    private SnowFlake snowFlake;
    //注册
    @Override
    public void register(User req) {
        User user = CopyUtil.copy(req, User.class);
        if (ObjectUtils.isEmpty(req.getId())){
            User userDb = selectByLoginName(req.getUsername());
            if (ObjectUtils.isEmpty(userDb)){
                user.setId(snowFlake.nextId());
                sysUserMapper.insert(user);
            }
        }
    }

    @Override
    public User login(User req) {
        User userDb = selectByLoginName(req.getUsername());
        if (ObjectUtils.isEmpty(userDb)){
//            用户不存在
            return null;
        }else {
//            登录成功
            User user = CopyUtil.copy(userDb,User.class);
            return user;
        }
    }

    //查询loginName是否被注册
    public User selectByLoginName(String loginName){
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getUsername,loginName);
        List<User> users = sysUserMapper.selectList(wrapper);
        if (CollectionUtils.isEmpty(users)){
            return null;
        }else {
            return users.get(0);
        }
    }
}