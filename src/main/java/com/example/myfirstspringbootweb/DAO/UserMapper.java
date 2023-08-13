package com.example.myfirstspringbootweb.DAO;

import com.example.myfirstspringbootweb.entity.Device;
import com.example.myfirstspringbootweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component
@Repository
public interface UserMapper {
    List<User> findAll();
    List<Device> getDevices(String username);
    User findByUsername(String username);
    int insert(User user);
    int update(User user);
    int delete(String username);
    int deleteByUsername(String username);
    //int deleteByUsername(User user);
    //int deleteByUsernameAndPassword(User user);
    boolean setdevicetype(String username, String deviceType);

    User findByUserId(int userId);
}
