package com.korit.study.ch03;

import java.io.PrintStream;
import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        //    - `next()`: 고객ID, 상품코드 입력
//- `nextInt()`: 수량, 우편번호 입력
//- `nextLine()`: 상품명, 배송주소 입력
//- 총 금액 계산 및 배송비 적용
//- **핵심**: 입력 순서와 Scanner 메서드를 정확히 사용
//
//### **입력 순서**
//
//            1. 고객 ID (공백 없는 문자열)
//2. 상품 코드 (공백 없는 문자열)
//3. 상품명 (한 줄 전체, 공백 포함)
//4. 수량 (정수)
//5. 단가 (정수)
//6. 우편번호 (정수)
//7. 배송 주소 (한 줄 전체, 공백 포함)
//
//### **계산 로직**
//
//            - 총 상품가격 = 단가 × 수량
//- 배송비: 3만원 이상 구매시 무료, 미만시 3,000원
//- 최종 금액 = 상품가격 + 배송비
        String id = "";
        String code = "";
        String name = "";
        int count;
        int price;
        int postNum;
        String address = "";

        Scanner scanner = new Scanner(System.in);
        System.out.print("고객아이디 입력하시오");
        id = scanner.next();
        System.out.print("상품 코드 입력하시오");
        code = scanner.next();
        scanner.nextLine();
        System.out.print("상품 이름 입력하시오");
        name = scanner.nextLine();
        System.out.print("상품 갯수 입력하시오");
        count = scanner.nextInt();
        System.out.print("상품 가격 입력하시오");
        price = scanner.nextInt();
        System.out.print("우편번호 입력하시오");
        postNum = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송주소 입력하시오");
        address = scanner.nextLine();
        int itemPrice = price * count;
        int delPrice = itemPrice >= 30000 ? 0 : 3000;
        int totalPrice = (itemPrice) + delPrice;

//        === 주문 확인서 ===
//        고객 ID: user123
//        상품 정보:
//        - 상품코드: P001
//                - 상품명: 무선 블루투스 이어폰
//                - 단가: 45,000원 × 2개 = 90,000원
//        배송 정보:
//        - 우편번호: 12345
//                - 주소: 서울시 강남구 테헤란로 123 ABC빌딩 456호
//                - 배송비: 무료 (3만원 이상 구매)
//        총 결제 금액: 90,000원

        System.out.println();
        System.out.println("=== 주문 확인서 ===");
        System.out.printf("""
                고객 ID: %s
                상품 정보:  \s
                - 상품코드: %s
                    상품명: %s
                    단가: %,d원
                배송 정보:\s
                - 우편번호: %d
                     -주소: %s
                     -배송비: %,d원
                총 결제 금액: %,d원""", id, code, name, price
                , postNum, address, delPrice, totalPrice
        );







    }

}
