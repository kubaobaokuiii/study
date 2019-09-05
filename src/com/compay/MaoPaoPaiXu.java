package com.compay;

import java.util.Arrays;

/**
 * 冒泡排序(比较相邻两个数，把较大的值放在最前面)
 * @author guo shuang
 */
public class MaoPaoPaiXu {

    public static void main(String[] args){

        int[] arr = {2,5,7,8,10,44,3};

        System.out.println("排序前:"+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length ; j++) {

                if(arr[i] < arr[j]){

                    int temp = arr[i];

                    arr[i] = arr[j];

                    arr[j] = temp;
                }

            }

        }

        System.out.println("排序后:" + Arrays.toString(arr));

    }
}
