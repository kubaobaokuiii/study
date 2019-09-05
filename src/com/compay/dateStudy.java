package com.compay;

import java.time.LocalDateTime;
import java.util.Calendar;

public class dateStudy {

    public static void main(String[] args){

//        Calendar calendar = Calendar.getInstance();
//
//        calendar.add(Calendar.DATE,1);
//
//        System.out.println(calendar.getTime());

//        //获取当前时间
//        LocalDateTime today = LocalDateTime.now();
//
//        //当前时间+1天
//        LocalDateTime tomorrow = today.plusDays(1);
//
//        //打印明天的时间
//        System.out.println(tomorrow);

//        LocalDateTime today = LocalDateTime.now();
//
//        //minusDays()方法相当于当前时间减去n天，传负值相当于加一天
//        LocalDateTime tomorrow = today.minusDays(-1);
//
//        System.out.println(tomorrow);

        String str = "guo";

        String strs = str.substring(0,1);

        //String的substring()方法不会修改原字符串内容
        System.out.println(str);

        System.out.println(strs);
    }
}
