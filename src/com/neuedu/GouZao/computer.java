package com.neuedu.GouZao;

public class computer {

    private char color;
    private int cpuNum;
//    无参
    public computer(){

    }
    public void  setColor(char color1){
        color=color1;
    }
    public void setCpuNum(int cpuNum1){
        cpuNum=cpuNum1;
    }
    public char getColor(){
        return color;
    }
    public int getCpuNum(){
        return cpuNum;
    }
    public computer(char color,int cpuNum){
        this.color=color;
        this.cpuNum=cpuNum;
    }
    public void showTest2(){
        System.out.println("笔记本的颜色"+getColor());
        System.out.println("笔记本的型号"+getCpuNum());
    }
    }

