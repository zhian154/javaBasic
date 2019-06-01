package com.neuedu.chouxiang;
import java.util.Scanner;
public class GongyYue {
//    输入两个正整数m和n，求其最大公约数和最小公倍数。
        public static void main(String[] args) {
            System.out.print("input two integers:");
            try{
                Scanner scanner = new Scanner(System.in);
                int m =scanner.nextInt();
                int n =scanner.nextInt();
                //分别将较大的值赋给m,较小的值赋给n
                if(m<n){
                    int tmp=m;
                    m=n;
                    n=tmp;
                }
                int product = m*n;//两个数的乘积
                while(n!=0){
                    int tmp=n;
                    n=m&n;
                    m=tmp;
                }
                System.out.println("the greatest common divisor id:"+m);
                System.out.println("the least common multiple is:"+product/m);

            }catch(Exception e){
                System.out.println("please input integer!");
            }
            System.exit(0);

        }


}
