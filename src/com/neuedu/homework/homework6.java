package com.neuedu.homework;

import java.util.Scanner;

public class homework6 {
    /*
     * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
     * */
    public static void main(String[] args) {
        System.out.println("请输入一个五位正整数");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 10000 && input >= 100000) {
            System.out.println("输入的不是五位正整数!");
            return;
        }
        int a = input / 10000;
        int b = input / 1000 % 10;
        int c = input / 100 % 10;
        int d = input / 10 % 10;
        int e = input % 10;
        if (a == e && b == d) {
            System.out.println(input + "是回文数");
        } else {
            System.out.println(input + "不是回文数");
        }
    }
}
