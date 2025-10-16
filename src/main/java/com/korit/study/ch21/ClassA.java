package com.korit.study.ch21;

public class ClassA {
    public void run() {
       Singleton.getSynchronizedInstance().changeData();
       Singleton.getSynchronizedInstance().deleteData();
    }
}
