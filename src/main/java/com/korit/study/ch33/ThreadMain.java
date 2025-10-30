package com.korit.study.ch33;

class Counter {
    private int counter = 0;
    public void increment() {
        counter++;
    }
    public void decrement() {
        counter--;
    }
    public int getCounter() {
        return counter;
    }
}




public class ThreadMain {
    public static void main(String[] args) {

        /**
         * Thread(쓰레드)
         * 1. 싱글쓰레드: 쓰레드 하나만 사용의 의미(main메서드 하나만 사용)
         * 2. 멀티쓰레드: 쓰레드 두개 이상 사용
         */

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("1번 반복문: " + i);
                counter.increment();
            }
        });


        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("2번 반복문: " + i);
                counter.increment();
            }
        });


        System.out.println("쓰레드 시작!!!");


        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();

            System.out.println(counter.getCounter());
            System.out.println("쓰레드 종료");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
