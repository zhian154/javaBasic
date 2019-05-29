package com.neuedu.GouZao;

public class CreatePerson {
    private  int age;
    public String name;
    public int height;
    public int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void sayHello(){
        System.out.println("hello,my name is XXX"+name);
    }
}
