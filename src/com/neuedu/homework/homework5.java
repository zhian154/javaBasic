package com.neuedu.homework;

public class homework5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1到100的偶数和为：" + sum);
        int num=0;
        for (int i = 1; i <= 100; i += 2) {
            num += i;
        }
        System.out.println("1到100的奇数和为：" + num);
    }
}
