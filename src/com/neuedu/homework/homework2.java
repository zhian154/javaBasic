package com.neuedu.homework;

import java.util.Scanner;

public class homework2 {
    /*
    * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下 的用C表示。
    * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=input.nextInt();
        if (result>=90){
            System.out.println("A");
        }
        if (result>=60&& result < 90){
            System.out.println("B");
        }
        if (result<60){
            System.out.println("C");
        }

    }
}
