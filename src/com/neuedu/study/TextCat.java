package com.neuedu.study;

public class TextCat {
    public static void main(String[] args) {


//    int width;
//    int height;
//    public void c(){
//        int a=(width+height)*2;
//        System.out.println("长方体的周长是："+a);
//    }
//    public  void s(){
//        int b=width*height;
//        System.out.println("长方体的面积是："+b);
//    }
//    //有一个参数
//    public  void c1(int i){
//        int a=(width+height)*2;
//        System.out.println("长方体的周长是："+a);
//    }
//    public  void s1(int j) {
//        int b = width * height;
//        System.out.println("长方体的面积是：" + b);
//    }
//    //有两个参数
//    public  void c2(int width,int height){
//        int a=(width+height)*2;
//        System.out.println("长方体的周长是："+a);
//    }
//    public  void s2(int width,int height) {
//        int b = width * height;
//        System.out.println("长方体的面积是：" + b);
//    }


//   Circle circle = new Circle();
//   System.out.println("请输入半径(不要输入负值)");
//   Scanner input = new Scanner(System.in);
//   int radius = input.nextInt();
//    circle.setRadius(radius);
//    System.out.println(circle.zhouchang());



//
//        Car car =new Car();
//        car.setMark("aodi");
//


//        int [] arr = new int [5];
        Students[] stus = new Students[5];
        for(int i=0;i<stus.length;i++){
        Students student = new Students();
        student.sname="abc";
        student.score=80+i;
        stus[i] = student;
        }
//        for (int i=0;i<stus.length;i++){
//            for (int j=0;j<stus.length;j++){
//                if (stus[j].score>stus[j+1].score){
//
//                }
//            }
//        }
        for(Students s:stus){
           System.out.println(s);
        }

}
}