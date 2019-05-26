package com.neuedu.homework;

import java.util.Scanner;

public class homework10 {
    public static void main(String[] args) {
//一个整数的各位数字之和能被 9 整除，则该数也能被 9 整除。编程验证给定的整数能否被 9 整除。
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int a = 0;
        while (i%10>0){
            a += i%10;
//            a=a+i%10;
            i = i/10;
        }
        a+=i;
        if (a%9==0){
            System.out.println("能被9整除");
        }else {
            System.out.println("不能被9整除");
        }

    }
}
