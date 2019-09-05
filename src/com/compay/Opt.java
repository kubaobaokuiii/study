package com.compay;

import java.util.Arrays;

/**
 * 选择排序
 * @author guo shaung
 * 选择排序是从待排序的数据元素中选出最小(最大元素)放在最后
 */
public class Opt {

    public static void main(String[] args){

        int[] arr = {2,8,13,11,6,7};

        System.out.println("排序前:" + Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {

            int lowerIndex = i;

            for (int j = i + 1; j < arr.length ; j++) {

                //找出最小的索引(按照从小到大的)
                if(arr[j] < arr[lowerIndex]){

                    lowerIndex = j;

                }

            }

            //交换
            int temp = arr[i];

            arr[i] =arr[lowerIndex];

            arr[lowerIndex] = temp;

        }

        System.out.println("排序后:" + Arrays.toString(arr));

    }
}
