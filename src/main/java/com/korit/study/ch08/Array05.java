package com.korit.study.ch08;

import java.util.Scanner;

public class
Array05 {
    public static String[] products = new String[]{"멘토스", "아이셔", "스키틀즈", "호올스"};
    public static String[] productPrice = new String[]{"900원", "1500원", "1000원", "1200원"};
    public static void main(String[] args) {
        System.out.println("[상품관리 시스템]");
        showMainMenuView();
    }

    public static void showMainMenuView() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            System.out.println("1. 상품 추가");
            System.out.println("2. 상품 조회");
            System.out.println("0. 종료");
            System.out.println("선택: ");
            int selectedNumber = scanner.nextInt();
            scanner.nextLine();

            if (selectedNumber == 0) {
                isExit = true;
            } else if (selectedNumber == 1) {
                addProduct();
            } else if (selectedNumber == 2) {
                showProductNameList();
            }
        }
    }


    public static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        String newProductName = null;
        while (true) {
            System.out.println("[상품 추가 기능]");
            System.out.println("상품이름 입력: ");
            newProductName = scanner.nextLine();

            if (findByProductName(newProductName) == null) {
                break;
            }
            System.out.println("이미 존재하는 상품입니다. 다시 입력하세요");
        }
        add(newProductName);
        System.out.println("<< 상품이름 추가 완료. >>");
    }

    public static void showProductNameList() {
        Scanner scanner = new Scanner(System.in);
        int size = 1;
        while (true) {
            System.out.println("상품 정보 조회");
            System.out.println("뒤로 가려면 0을 입력하세요.");
            System.out.printf("페이지 번호 입력(1 ~ %d): ", getLastPage(size));
            int selectedPage = scanner.nextInt();
            scanner.nextLine();

            if (selectedPage == 0) {
                break;
            } else if (selectedPage > getLastPage(size)) {
                System.out.println("해당 페이지는 찾을 수 없습니다.");
            } else {
                String[] productsOfPagination = pagination(selectedPage, size);
                for (int i = 0; i < productsOfPagination.length; i++) {
                    System.out.printf("%d. %s\n", i + 1, productsOfPagination[i]);
                }

            }
        }

    }


    public static String findByProductName(String productName) {
        for (String n : products) {
            if (n.equals(productName)) {
                return n;
            }
        }
        return null;
    }

    public static void add(String productName) {
        String[] newArray = new String[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            newArray[i] = products[i];
        }
        newArray[newArray.length - 1] = productName;
        products = newArray;
    }






    public static int getLastPage(int size) {
        return products.length % size == 0 ? products.length / size : products.length / size + 1;
    }


    public static String[] pagination(int page, int size) {
        int startIndex = (page - 1) * size; //(1 -1) * 10 => o, (2 - 1) * 10 => 10
        int lastPage = getLastPage(size);
        boolean isLast = page == lastPage;
        int paginationArraySize = isLast && products.length % size != 0 ? products.length % size : size;
        String[] paginationArray = new String[paginationArraySize];
        for (int i = startIndex; i < startIndex + paginationArraySize; i++) {
            paginationArray[i - startIndex] = products[i];
        }
        return paginationArray;
    }

    public static String findByProductPrice(String productPrice) {
        for (String n : products) {
            if (n.equals(productPrice)) {
                return n;
            }
        }
        return null;
    }
}
