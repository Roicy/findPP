package com.example.myfirstspringbootweb.service;
import com.example.myfirstspringbootweb.DAO.DeviceMapper;
import com.example.myfirstspringbootweb.DAO.UserMapper;
import com.example.myfirstspringbootweb.entity.Device;
import com.example.myfirstspringbootweb.entity.User;
import com.example.myfirstspringbootweb.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Component

@Service
public class UserService {
    @Autowired
    private static UserMapper userMapper;
    public List<User> findAll() {

        return userMapper.findAll();
    }
    public List<Device> getDevices(String username){

        return userMapper.getDevices(username);
    }
    public List<User> findByUsername(String username){

        return (List<User>) userMapper.findByUsername(username);
    }
    public User findByUserId(int userId){

        return userMapper.findByUserId(userId);
    }
    public int update(User user){

        return  userMapper.update(user);
    }
    public int delete(String username){

        return   userMapper.delete(username);
    }
    @Bean
    //@Autowired
    public PageBean queryPage (Map<String, Object> paramMap) {

        //return null;
        return  null;
    }

     public int insert(User user){

        return userMapper.insert( user);
     }


    //int deleteByUsername(String username);
    //int deleteByUsername(User user);
    //int deleteByUsernameAndPassword(User user);
    public boolean setdevicetype(String username, String deviceType){
        return userMapper.setdevicetype(username, deviceType);
    }
}

