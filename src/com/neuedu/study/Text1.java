package com.neuedu.study;

public class Text1 {
    int width;
    int height;
    public void c(){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void s(){
        int b=width*height;
        System.out.println("长方体的面积是："+b);
    }
    //有一个参数
    public  void c1(int i){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void s1(int j) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }
    //有两个参数
    public  void c2(int width,int height){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void s2(int width,int height) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }


}
