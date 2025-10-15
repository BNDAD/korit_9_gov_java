package com.korit.study.ch09;

import java.sql.SQLOutput;

public class Product {
    String name;
    int price;



    int discount() {
        return (int) (price - (price * 0.2));
    }

}
