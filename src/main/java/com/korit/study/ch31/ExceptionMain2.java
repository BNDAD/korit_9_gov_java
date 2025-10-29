package com.korit.study.ch31;

import java.io.IOException;
import java.util.List;

public class ExceptionMain2 {
    public static void main(String[] args) throws IOException {
        List<String> names = List.of("김준일", "김준이");
        try {
            print(names, 3);
        } catch (IOException e) {

        } catch (NullPointerException e) {

        } catch (ArrayIndexOutOfBoundsException e) {


        }
        System.out.println("프로그램 정상 종료");
    }

    public static void print(List<String> names, int size) throws
            IOException,
            NullPointerException,
            ArrayIndexOutOfBoundsException {

        System.out.println(names.size());
        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i));
        }
    }
}
