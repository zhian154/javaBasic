package com.neuedu.homework;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
//        判断一个年份是平年还是闰年
        System.out.println("请输入年份");
        Scanner input =new Scanner(System.in);
        int i =input.nextInt();
        if(i%4==0&&i%100!=0||i%400==0){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

    }
}
