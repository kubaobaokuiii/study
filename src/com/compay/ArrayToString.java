package com.compay;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * 数组转字符串方法
 * @author guo shaung
 */
public class ArrayToString {


    /**
     * 遍历拼接法
     */
//    public static void main(String[] args){
//
//        String[] arr = {"guo","stone","wang"};
//
//        StringBuffer sb = new StringBuffer();
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            //追加
//            sb.append(arr[i]);
//
//            if(i != arr.length -1)
//                sb.append(",");
//
//        }
//
//        System.out.println(sb.toString());
//
//    }

    /**
     * Arrays.toString()方法
     */

//    public static void main(String[] args){
//
//        String[] arr = {"guo","stone","wang"};
//
//        String ar2 = Arrays.toString(arr);
//
//        System.out.println(ar2);
//
//
//    }

    /**
     * StringUtils.join()转换
     */

//    public static void main(String[] args){
//
//        String[] arr = {"guo","stone","wang"};
//
//        //使用英文逗号分隔
//        String str3 = StringUtils.join(Arrays.asList(arr,","));
//
//        System.out.println(str3);
//
//    }

    /**
     * JDK8方式遍历循环
     */
    public static void main(String[] args) {

        Integer[] arr = {2,4,6,7,9};

        Arrays.asList(arr).forEach(x -> System.out.println(x));
    }

}
