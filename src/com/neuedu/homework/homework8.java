package com.neuedu.homework;
import java.util.Scanner;
public class homework8 {
    public static void main(String[] args) throws Exception{
//    编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
        char i = (char)System.in.read();
         if (i>='i'&&i<='z'){
              i-=32 ;
              System.out.println(i);
          }else {
             System.out.println(i);
            }
    }
}
