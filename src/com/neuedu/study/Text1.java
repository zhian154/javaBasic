package com.neuedu.study;

public class Text1 {
    int width;
    int height;
    public void oblong(){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong(){
        int b=width*height;
        System.out.println("长方体的面积是："+b);
    }
    //有一个参数
    public  void oblong2(int i){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong2(int j) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }
    //有两个参数
    public  void oblong3(int width,int height){
        int a=width*2+height*2;
        System.out.println("长方体的周长是："+a);
    }
    public  void ovlong3(int width,int height) {
        int b = width * height;
        System.out.println("长方体的面积是：" + b);
    }


}
