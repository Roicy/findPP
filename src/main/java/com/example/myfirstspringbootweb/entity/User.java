package com.example.myfirstspringbootweb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("deviceuser")
public class User {
    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;
    @TableId(value = "username", type = IdType.INPUT)
    private String username;
    @TableId(value = "password", type = IdType.INPUT)
    private String password;
}

