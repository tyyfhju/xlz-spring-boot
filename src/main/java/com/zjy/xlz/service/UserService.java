package com.zjy.xlz.service;

import com.zjy.xlz.entity.User;

public interface UserService {
void register(User req);
    User login(User req);
}
