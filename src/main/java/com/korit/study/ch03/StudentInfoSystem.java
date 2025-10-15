package com.korit.study.ch03;

import java.io.PrintStream;
import java.util.Scanner;

public class StudentInfoSystem {
    public static void main(String[] args) {
//        ### **요구사항 * *
//
//                - `next()`:학생 이름 입력
//                - `nextInt()`:나이, 학년, 3 과목 점수 입력
//                - `nextLine()`:자기소개 입력
//        -평균 점수 계산 및 학점 산출
//                - * * 주의 * *: `nextInt()` 후 `nextLine()` 사용 시 버퍼 처리 필요
//
//### **입력 순서**
//
//        1. 학생 이름 (공백 없는 문자열)
//        2. 나이(정수)
//        3. 학년(정수)
//        4. 국어 점수 (정수)
//                5. 영어 점수 (정수)
//                6. 수학 점수 (정수)
//                7. 자기소개(한 줄 전체, 공백 포함 가능)

        Scanner scanner = new Scanner(System.in);
        System.out.println("이름이 뭅니까");
        String sName = scanner.next();
        System.out.println("이름은: " + sName);
        System.out.println("나이가 우예 됩니까");
        int sAge = scanner.nextInt();
        System.out.println("나이: " + sAge);
        System.out.println("몇한년이고? ");
        int sGrade = scanner.nextInt();
        System.out.println("학년은 " + sGrade);
        System.out.println("국어, 영어, 수학 점수를 하나씩 입력하소");
        int sScore1 = scanner.nextInt();
        int sScore2 = scanner.nextInt();
        int sScore3 = scanner.nextInt();
        int totalScore = sScore1 + sScore2 + sScore3;
        int scoreAvg = totalScore / 3;
        String scoreTier = scoreAvg <= 100 && scoreAvg > 89 ? "A" : scoreAvg > 69 ? "B" : scoreAvg > 49 ? "C" : "F";
        System.out.println("국어 점수는: " + sScore1 + "\n영어 점수는 " + sScore2 + "\n수학 점수는 " + sScore3 + "\n평균은 " + scoreAvg +"\n학점은 " + scoreTier);
        scanner.nextLine();
        System.out.println("자기 소개 해보소");
        String sBio = scanner.nextLine();
        System.out.println("자기소개 해보겠슴돠 \n" + sBio);

        System.out.println("=== 학생 정보 ===");
        PrintStream printf = System.out.printf("""
                이름: %s
                나이: %d
                성적:
                    국어: %d점
                    영어: %d점
                    수학: %d점
                    평균: %d점 (학점: %s)
                자기소개: %s%n""", sName, sAge, sScore1, sScore2, sScore3, scoreAvg, scoreTier, sBio
        );
    }
}
