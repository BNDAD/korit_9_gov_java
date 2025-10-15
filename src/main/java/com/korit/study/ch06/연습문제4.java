package com.korit.study.ch06;

public class 연습문제4 {
    public static void main(String[] args) {

        printStudentInfo("김백년", 100, 100, 100);
        System.out.println(getGrade(59));
    }


        // 평균을 계산하는 함수 (정수 2개)
        public static double average(int score1, int score2) {
            return  (score1 + score2) / 2.0;
        }

    public static double average(int score1, int score2, int score3) {
        return  (score1 + score2 + score3) / 3.0;
    }

    public static char getGrade(double average) {
        return average >= 90 ? 'A'
                : average >= 80 ? 'B'
                : average >= 70 ? 'c'
                : 'F';
    }
    public static void printStudentInfo(String name, int score1, int score2, int score3) {
        double avg = average(score1, score2, score3);

        char gr = getGrade(average(score1, score2, score3));
        System.out.println(name + " 학생의 평균: " + avg + " 등급: " + gr);
    }





}
