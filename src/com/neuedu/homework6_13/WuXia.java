package com.neuedu.homework6_13;
import java.util.HashMap;
import java.util.Map;

public class WuXia {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        map.put(5, "李晓红");
        
        map.remove(1);
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
        map.put(2,"周林");
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}