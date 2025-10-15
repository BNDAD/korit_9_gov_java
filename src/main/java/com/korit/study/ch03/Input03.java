package com.korit.study.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Input03 {
    public static void main(String[] args) throws IOException {
//        InputStream is = System.in
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String Line = br.readLine();
//        System.out.println(Line);
        String[] datas = Line.split(" ");
        Arrays.stream(datas).forEach(System.out::println);

    }
}
