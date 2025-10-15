package com.korit.study.ch06;

public class 연습문제3 {
    public static void main(String[] args) {


    }
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void checkTemparatureConversion(double celsius) {
        celsiusToFahrenheit(celsius);
        System.out.println("화씨변환" + celsiusToFahrenheit(celsius));
        fahrenheitToCelsius(celsiusToFahrenheit(celsius));
        System.out.println("다시 섭씨변환" + fahrenheitToCelsius(celsiusToFahrenheit(celsius)));

    }
    public static int add(int a, int b) { return a + b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int subtract(int a, int b) { return a - b; }

    public static int calculate(int a, int b, int c, int d) {
        return subtract(multiply(add(a, b), c), d);
    }

}
