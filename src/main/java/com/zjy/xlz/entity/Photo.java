package com.zjy.xlz.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@Component
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
    private int id;
    private String name;
    private String images;
}
