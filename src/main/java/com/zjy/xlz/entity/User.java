package com.zjy.xlz.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
}