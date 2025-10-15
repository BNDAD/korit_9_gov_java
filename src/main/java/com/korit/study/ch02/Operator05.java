package com.korit.study.ch02;

public class Operator05 {
    public static void main(String[] args) {
        String r = 10 > 0 ? "영보다 큼" : "영보다 작음";
        double r2 = 10 > 0 ? 1.1 : 1.2;
        char r3 = 10 > 0 ? '큼' : '작';
        String r4 = -10 > 0 ? "영보다큼" : (-10 > -20 ? "마이너스이십보다커" : "작아");
        String r5 = 2002 % 100 == 0 ? "100의 배수" : "100의 배수가 아님";

        int year = 1999;
        String result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "윤년" : "평년";
        System.out.println(result);

        int 현재잔액 = 150000;
        int 출금금액 = 5000;
        boolean 출금불가능 = 현재잔액 - (출금금액 + 1000) < 0;

        String 상태 = 출금불가능 ? "실패" : "성공";
        int 출금액 = 출금불가능 ? 0 : 출금금액 + 1000;
        int 거래후잔액 = 출금불가능 ? 현재잔액 : 현재잔액 - (출금금액 + 1000);

        System.out.println(거래후잔액);
    }
}
