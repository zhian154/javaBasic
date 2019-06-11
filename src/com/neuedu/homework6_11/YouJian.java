package com.neuedu.homework6_11;

import java.util.ArrayList;
import java.util.List;

public class YouJian {

        public static void main(String[] args) {
            List le=new ArrayList();

            le.add(new Post("张三","翘街","黎平","贵州","中国","091"));
            le.add(new Post("李四","闸北","临沂","山东","中国","021"));
            le.add(new Post("王五","徐汇","南京","江苏","中国","021"));

            for(int i=0;i<le.size();i++)
            {
                Post p=(Post)le.get(i);
                System.out.println(p.name + p.street + p.city+p.province+p.country+p.code);
            }
        }
    }
    class Post {
        String name;
        String street;
        String city;
        String province;
        String country;
        String code;
        public Post(String name, String street, String city, String province, String country,String code) {
            this.name = name;
            this.street = street;
            this.city = city;
            this.province = province;
            this.country = country;
            this.code = code;
        }

}
