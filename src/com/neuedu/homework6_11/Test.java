package com.neuedu.homework6_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

    List<Workers> list = new ArrayList<>();

        list.add(new Workers("zhang3",18,3000));
        list.add(new Workers("li4",25,3500));
        list.add(new Workers("wang5",22,3200));

        list.add(1,new Workers("zhao6",24,3300));
        list.remove(3);
        System.out.println("================for 循环遍历");
        for (Workers a:list){
            System.out.println(a);
        }
        System.out.println("================迭代遍历");
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    }
