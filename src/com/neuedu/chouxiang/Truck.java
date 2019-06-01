package com.neuedu.chouxiang;

public class Truck extends Car{
    private double payload;

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
    public Truck(int wheels,double weight,int loader,double payload){
        super(wheels,weight,loader);
        this.payload = payload;
    }
}
