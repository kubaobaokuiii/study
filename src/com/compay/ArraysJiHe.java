package com.compay;

import java.util.Arrays;
import java.util.List;

/**
 * 数组转集合学习
 * @author  guo shaung
 */
public class ArraysJiHe {

    public static void main(String[] args){

        String[] strArr = {"cat","dog"};

        //数组转集合
        List list = Arrays.asList(strArr);

        //数组转字符串
        String str = Arrays.toString(strArr);

        System.out.println(str);

        System.out.println(list);

    }
}
