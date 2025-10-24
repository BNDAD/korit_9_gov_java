package com.korit.study.ch27;

public class AnonymousClassImp implements AnonymousClass {

    @Override
    public void fx1() {
        System.out.println("fx1 호출");
    }

    @Override
    public int fx2() {
        return 10;
    }
}
