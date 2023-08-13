package com.example.myfirstspringbootweb.DAO;

import com.example.myfirstspringbootweb.entity.Device;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DeviceMapper {
    List<Device> findAll();

    List<Device> getAllByuserid(Integer valueOf);

    boolean checkDevice(String device);

    Device getDevice(Integer id);

    int adddevice(String device);

    boolean updateDevice(Device device);

    boolean deleteDevice(Integer id);

    boolean getLacation(Device device);
}

