package com.example.myfirstspringbootweb.utils;

public class LocationUtils {
//从前端页面获取的经纬度信息
    public static double[] getLocation(String location){
        String[] locationArr = location.split(",");
        double[] locationArrDouble = new double[2];
        locationArrDouble[0] = Double.parseDouble(locationArr[0]);
        locationArrDouble[1] = Double.parseDouble(locationArr[1]);
        return locationArrDouble;
    }


}

//    public void getLocation() {
//
//            }
// 获取经纬度






