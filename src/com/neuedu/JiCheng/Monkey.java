package com.neuedu.JiCheng;

public class Monkey {
    /*
    * 3、编写一个Java应用程序，该程序包括3个类：Monkey类、People类和主类E。要求：
    (1) Monkey类中有个构造方法：Monkey (String s)，并且有个public void speak()方法，在speak方法中输出“咿咿呀呀......”的信息。
    (2)People类是Monkey类的子类，在People类中重写方法speak(),在speak方法中输出“小样的，不错嘛！会说话了！”的信息。
    (3)在People类中新增方法void think()，在think方法中输出“别说话！认真思考！”的信息。
    (4)在主类E的main方法中创建Monkey与People类的对象类测试这2个类的功能。
    * */
    public String a;
    public Monkey(){

    }
    public Monkey(String a){
        this.a=a;
    }
    public void speak(){
        System.out.println("咿咿呀呀......");
    }
}
