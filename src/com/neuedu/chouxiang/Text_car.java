package com.neuedu.chouxiang;

public class Text_car  {
    public static void main(String[] args) {
        Vehicle v= new Vehicle(4,2);
        System.out.println("汽车A有"+v.getWheels()+"个轮子,它的重量是"+v.getWeight()+"吨");

        Car c = new Car(8,2,20);
        System.out.println("汽车B有"+c.getWheels()+"个轮子,它的重量是"+
                c.getWeight()+"吨,能载"+c.getLoader()+"个人");

        Truck t= new Truck(8,3,4,10);
        System.out.println("汽车C有"+t.getWheels()+"个轮子,它的重量是"+t.getWeight()+"吨,能载"+
                t.getLoader()+"个人,能装"+t.getPayload()+"吨货");

    }
}
