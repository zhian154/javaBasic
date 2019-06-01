package com.neuedu.chouxiang;

public class Car extends Vehicle {
    // 定义新的成员变量
    private int loader;

    public int getLoader() {
        return loader;
    }

    public void setLoader(int loader) {
        this.loader = loader;
    }

    // 调用父类构造方法
    public Car(int wheels, double weight,int loader) {
        super(wheels, weight);
        this.loader=loader;

    }
}