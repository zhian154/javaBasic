package com.neuedu.GouZao;

public class Worker extends Person1{
//    父类 基类 通用的特征 属性
//    子类 派生类 具有自己功能特征的类
// java   继承  单根继承 一个子类只能继承一个父类
//    java中 不明确继承  继承object最大
//    super 调用父类方法
    private int  num;
    private float  salsry;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getSalsry() {
        return salsry;
    }

    public void setSalsry(float salsry) {
        this.salsry = salsry;
    }
//方法重方法重载
/*
* 重载 在一个类中发生现象
* 重写 方法名相同 参数列表不同 （类型 个数 顺序不同）与返回值无关
* 重写 与父类中相同的方法
*
*
*
* 访问权限修饰符
* public 不同包 不同类
* */



//    public void com
}
