package com.example.myfirstspringbootweb.service;

import com.example.myfirstspringbootweb.DAO.DeviceMapper;
import com.example.myfirstspringbootweb.entity.Device;
import com.example.myfirstspringbootweb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Component
public class DeviceService {
   @Autowired
    private static DeviceMapper deviceMapper;

    public static List<Device> getAllByuserid(Integer valueOf) {
        List<Device> deviceList=deviceMapper.getAllByuserid(valueOf);

        return deviceList;
    }

    public List<Device> findAll() {
        return deviceMapper.findAll();
    }
@Bean
    public PageBean queryPage(Map<String, Object> paramMap) {

        //return null;
    return  null;
    }

    public boolean checkDevice(String device) {

        return deviceMapper.checkDevice(device);
    }

    public int adddevice(String devicename) {

        return deviceMapper.adddevice(devicename);
    }

    public boolean updateDevice(Device device) {

        return deviceMapper.updateDevice(device);
    }

    public boolean deleteDevice(Integer id) {

        return deviceMapper.deleteDevice(id);
    }

    public Device getDevice(Integer id) {

        return deviceMapper.getDevice(id);
    }
    public boolean getLacation(Device device ){
        return deviceMapper.getLacation(device);


    }



}