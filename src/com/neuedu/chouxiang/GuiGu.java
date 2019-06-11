package com.neuedu.chouxiang;
import java.util.Scanner;
public class GuiGu {
    /*验证“鬼谷猜想”：对任意自然数，若是奇数，就对它乘以 3 再加 1；若是

    偶数，就对它除以 2，这样得到一个新数，再按上述计算规则进行计算，一直进

    行下去，最终必然得到 1
    */
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入一个自然数（完成鬼谷猜想）");
            int a = sc.nextInt();
            int a1=0;
            for(;;){
                if(a%2==0){
                    a1=a/2;
                }else{
                    a1=a*3+1;
                }
                a=a1;
                System.out.println(a);
                if(a==1) {
                    break;
                }
            }
        }
    }
