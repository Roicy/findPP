package com.example.myfirstspringbootweb.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("device")
public class Device {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableId(value = "deviceid", type = IdType.AUTO)
    private Integer deviceid;
    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;
    @TableId(value = "devicename", type = IdType.AUTO)
    private String devicename;
    @TableId(value = "deviceattribute", type = IdType.AUTO)
    private String deviceattribute;
    @TableId(value = "lacation", type = IdType.AUTO)
    private  String lacation;
    @TableId(value = "ipaddress", type = IdType.AUTO)
    private  String ipaddress;
    @TableId(value = "time", type = IdType.AUTO)
    private  String time;
    @TableId(value = "date", type = IdType.AUTO)
    private  String date;

}
