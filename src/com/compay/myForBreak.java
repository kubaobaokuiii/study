package com.compay;

/**
 * 跳出多重循环的方法（使用break）
 */
public class myForBreak {

    public static void main(String[] args){

//        myfor:for (int i = 0 ; i < 100 ; i++){
//
//            for (int j = 0; j < 100 ; j++) {
//
//                if(j == 10){
//
//                    //跳出多重循环
//                    break myfor;
//                }
//
//                System.out.println(j);
//
//            }
//        }

        boolean flag = true;

        for (int i = 0; i < 100 && flag; i++) {

            for (int j = 0; j < 100 ; j++) {

                System.out.println("j:" + j);

                if (j == 10){

                    flag = false;

                    break;
                }

            }

        }



    }

}
