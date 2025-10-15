package com.korit.study.ch06;

import java.time.LocalDateTime;
import java.util.Date;

public class 연습문제1 {
    public static void main(String[] args) {

        hi();
        hi("백년");
        제곱(50);
        time();
        Date now = new Date();
        System.out.println(now.getHours());
        System.out.println(now.getMinutes());
        System.out.println(isNowTime(3, 5));



    }
    public static void hi() {
        System.out.println("안녕하세요!");
    }

    public static void hi(String name) {
        System.out.println("안녕하세요!" + name + "님");
    }

    public static int 제곱(int number) {
        return number * number;
    }

    public static String time() {
        return "현재 시간입니다.";

    }


    public static String isNowTime(int hours, int minutes) {
        Date now = new Date();
        int nowHours = now.getHours();
        int nowMinutes = now.getMinutes();

        return hours == nowHours && minutes == nowMinutes ?
                "현재시간입니다." : "현재 시간이 아닙니다.";

    }




}
