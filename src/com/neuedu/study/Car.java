package com.neuedu.study;

public class Car {
    String mark;
    private int price;
    private int speed;
    public void setMark(String mark1){
        mark=mark1;
    }
    public  String getMark(){
        return  mark;
    }
    public void driver(){

    }
    public  void speedChange(int newSpeed){
        speed = newSpeed;
    }
}
