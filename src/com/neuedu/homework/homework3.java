package com.neuedu.homework;

public class homework3 {
    /*
    * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    * 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去 掉不满足条件的排列。
    * */
    public static void main(String[] args) {
        int  sum =0;
        for(int i=1;i<5;i++){
            for(int c=1;c<5;c++){
                for(int n=1;n<5;n++){
                    if(i!=c&&c!=n&&i!=n){
                        sum++;
                        System.out.println(i*100+c*10+n);
                    }
                }
            }
        }
        System.out.println("共有"+sum+"个不重复的三位数");

    }
}
