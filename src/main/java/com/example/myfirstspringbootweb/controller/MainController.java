package com.example.myfirstspringbootweb.controller;

import com.example.myfirstspringbootweb.Constant.UserConstant;
import com.example.myfirstspringbootweb.entity.Device;
import com.example.myfirstspringbootweb.service.DeviceService;
import com.example.myfirstspringbootweb.service.UserService;
import com.example.myfirstspringbootweb.utils.PageBean;
import com.example.myfirstspringbootweb.utils.R;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    private final DeviceService deviceService;
    private final UserService userService;

    public MainController(DeviceService deviceService, UserService userService) {
        this.deviceService = deviceService;
        this.userService = userService;

    }

    @GetMapping("/deviceList")
    public String deviceList() {

        return "helloworld";
        //return "/deviceList";
    }


      //异步获取设备列表数据

    @RequestMapping("/getdeviceList")
    @ResponseBody
    public Object getdeviceList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                @RequestParam(value = "rows", defaultValue = "100") Integer rows,
                                @RequestParam(value = "userid", defaultValue = "0") String userid,
                                @RequestParam(value = "deviceid", defaultValue = "0") String deviceid,
                                String type, String date, String time,String from, HttpSession session) {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("pageno", page);
        paramMap.put("pagesize", rows);
        if (!"0".equals(deviceid)) {
            paramMap.put("deviceid", deviceid);
        }
        if (!"0".equals(userid)) {
            paramMap.put("userid", userid);
        }


        Device device = (Device) session.getAttribute(UserConstant.DEVICE);
        if (paramMap.isEmpty()) {
            // 用户只能查询自己设备的信息
            paramMap.put("userid", device.getId());
        }

        PageBean pageBean = deviceService.queryPage(paramMap);

            Map<String, Object> result = new HashMap<>();
            result.put("total", pageBean.getTotalsize());
            result.put("rows", pageBean.getDatas());
            return result;

    }

    //通过id查询设备信息

    @RequestMapping("/getdevicebyid")
    @ResponseBody
    public Object getDeviceByid(@RequestParam(value = "userid", defaultValue = "0") String userid) {
        // 通过用户id查询设备信息
        List<Device> getDeviceList = DeviceService.getAllByuserid(Integer.valueOf(userid));

        return   getDeviceList;
    }



     //添加设备

    @PostMapping("/adddevice")
    @ResponseBody
    public R<Boolean> addDevice(String devicename) {
        // 判断是否已存在设备
        boolean checkDevice = deviceService.checkDevice(devicename);
        if (checkDevice) {
            // true 为已存在
            return R.fail("该设备已存在");
        } else {
            // Device device = deviceService.adddevice(UserService.getUsername());

            // 保存信息
            int count = deviceService.adddevice(devicename);
            if (count > 0) {
                return R.success("添加设备成功");
            }
        }
        return R.fail("添加设备失败");
    }
    @GetMapping("/deviceList")
    public String getdeviceList() {

        return "/deviceList";
    }

    @GetMapping("/login")
    public String login() {

        return "hello";
    }
    @GetMapping("/index")
    public String test() {
        return "/index";
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return"/index " ;
    }
    @RequestMapping("/PPproject")
    @ResponseBody
    public String project(@RequestBody String name) {
        
        return "彭彭的sb项目 " + name ;
    }
}


