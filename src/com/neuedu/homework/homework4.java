package com.neuedu.homework;

public class homework4 {
    //计算9！
    public static void main(String[] args) {
    int sum=1;
    for (int i=1;i<10;i++){
        //sum *= i;
        sum = i * sum;
    }
        System.out.println(sum);
    }
}
