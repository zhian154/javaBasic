package com.neuedu.study;

public class Rectangular {
            /*
        * 定义长方形类，含：
          特征：宽、高（整型）；
          方法：求周长、面积；
          方法3个：（1）无参——宽、高默认值为1；
                   （2）1个参数——宽、高均为参数值；
                   （3）2个参数——宽、高各为参数值。
          并对其进行测试
        * */
    public static void main(String[] args) {
        Text1 Rectangular= new Text1();
        Rectangular.width=1;
        Rectangular.height=1;
        System.out.println("无参");
        Rectangular.oblong();
        Rectangular.ovlong();
        System.out.println("一个参数");
        Rectangular.oblong2(5);
        Rectangular.ovlong2(3);
        System.out.println("两个参数");
        Rectangular.oblong3(3,7);
        Rectangular.ovlong3(6,8);



    }
}
