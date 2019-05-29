package com.neuedu.JiCheng;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Yuan cir = new Yuan();
        System.out.println("请输入圆的半径");
        Scanner c=new Scanner(System.in);
        cir.circular=c.nextInt();
        cir.setRadius(4);
        System.out.println("圆形的周长为"+cir.zhouchang());
        System.out.println("圆形的面积为"+cir.arse());
        Square are=new Square();
        System.out.println("请输入正方形的边长");
        Scanner s=new Scanner(System.in);
        are.side=s.nextDouble();
        System.out.println("正方形的周长为"+are.caculatePerimeter());
        System.out.println("正方形的面积为"+are.caculateArea());





    }
}
