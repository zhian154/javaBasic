package com.neuedu.study;

public class Circle {
/*
* 定义圆类，它有一个变量radius(半径)。从键盘输入数据，将半径传递给radius，
* 编程计算并输出圆的周长和面积（确保输入的数据不为负数）。
并对其进行测试
* */
        private int radius;
        public void setRadius(int radius1){
                if (radius1<0){
                        System.out.println("半径不能为负值");
                }else {
                        radius=radius1;
                }
        }
        public int getRadius(){
                return radius;
        }
        public double zhouchang(){
                return 2*Math.PI*radius;
        }
        public double arse(){
                return Math.PI*Math.pow(radius,2);
        }




}
