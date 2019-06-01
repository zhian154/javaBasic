package com.neuedu.chouxiang;

public class SanJiao extends Shape {
    public String qiuZC(double bian1,double bian2,double bian3){
        if((bian1+bian2)>bian3&&(bian2+bian3)>bian1&&(bian1+bian3)>bian2) {
            return "三角形的周长为：" + (bian1 + bian2 + bian3);
        }else {
            return "该三角形的边长不合法，两边之和必须大于第三边";
        }

    }
}
