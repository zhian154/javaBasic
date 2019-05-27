package com.neuedu.study;

public class Stud {
    public class Student {
        public String name;
        public String gender;
        public int age;
        private double score;


        public double getScore() {
            return score;
        }


        public void setScore(double score) {
            this.score = score;
        }


        public Student(String name, String gender, int age, double score) {
            super();
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.score = score;
        }


        public String toString() {
            return "Student [name=" + name + ", gender=" + gender + ", age=" + age
                    + ", score=" + score + "]";
        }
    }
}
