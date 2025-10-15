package com.korit.study.ch06;

import java.sql.SQLOutput;

public class 연습문제2 {
    public static void main(String[] args) {


    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return  a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void printInfo(String name) {
        System.out.println("이름: " + name);
    }

    public static void printInfo(String name, int age) {
        System.out.println("이름: " + name + "나이: " + age);
    }

}
