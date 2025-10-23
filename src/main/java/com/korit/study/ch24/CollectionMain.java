package com.korit.study.ch24;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        // 문자열을 담을 수 있는 ArrayList 생성
        List<String> list = new ArrayList<>();

        // 값을 추가
        list.add("문자열 값 1");
        list.add("문자열 값 2");

        // 값을 가져오기
        String str1 = list.get(0);
        String str2 = list.get(1);

        // 값을 수정
        String str3 = list.set(1, "문자열 값 3");
        System.out.println(str3);

        // 값 삭제
        boolean removed = list.remove(("문자열 값1"));
        String str4 = list.remove(0);
        System.out.println(removed);
        System.out.println(str4);


        // 리스트의 크기
        int size = list.size();


        //리스트 안에 값이 포함되어 있는지 확인
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("30");
        list.add("30");

        System.out.println(list.contains("20"));


        // 리스트 안에서 값이 위치하고 있는 Index 찾기
        int indexOf30 = list.indexOf("30");
        indexOf30 = list.lastIndexOf("30");


        // 중간에 위치하고 있는 데이터 30의 index  찾기
        int start = list.indexOf("30") + 1;
        indexOf30 = -1;
        for (int i = start; i < list.size(); i++) {
            if (list.get(i).equals("30")) {
                indexOf30 = i;
                break;
            }
        }
        System.out.println(indexOf30);

        // 리스트 자르기
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size());
        subList.indexOf("30");
        subList.add("40");
        System.out.println(subList);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.indexOf("50");


        // Set<집합>
        Set<String > strSet = new HashSet<>();

        // 값 추가
        strSet.add("나");
        strSet.add("다");
        strSet.add("가");
        System.out.println(strSet); // 해쉬값으로 정렬

        // 값 조회
        String r1 = null;
        String setSearchValue = "다";
        for (String s : strSet) {
            if (s.equals(setSearchValue)) {
                r1 = s;
                break;
            }

        }
        System.out.println(r1);
        if (strSet.contains(setSearchValue)) {
            r1 = setSearchValue;
        }
        System.out.println(r1);

        // 값 삭제
        strSet.remove("나");
        System.out.println(strSet);

        // 값 수정
        strSet.remove("다");
        strSet.add("라");


        // 리스트(list) -> 세트
        List<String> a = new ArrayList<>();
        a.add("가");
        a.add("가");
        a.add("나");
        a.add("나");
        a.add("다");
        a.add("라");
        a.add("라");

        Set<String> b = new HashSet<>();
        for (String s : a) {
            b.add(s);
        }
        System.out.println(b);
        Set<String> c = new HashSet<>();
        c.addAll(a);
        System.out.println(c);

        // 세트 -> 리스트
        List<String> d = new ArrayList<>();
        d.addAll(c);

        // Map(키 + 값 쌍 -> 집합)
        Map<String, String> strMap = new HashMap<>();

        // 값 추가
        strMap.put("a", "김준일");
        strMap.put("b", "김준이");
        strMap.put("c", "김준삼");
        strMap.put("d", "김준사");
        strMap.put("d", "김준오");

        System.out.println(strMap);

        // 값 조회
        String mapValue = strMap.get("c");
        System.out.println(mapValue);
        String mapValue2 = strMap.getOrDefault("g", "기본값");
        System.out.println(mapValue2);

        // 값 수정
        strMap.put("a", "김준육");
        System.out.println(strMap);

        // 값 삭제
        System.out.println(strMap.remove("a"));
        System.out.println(strMap.remove("a"));
        System.out.println(strMap.remove("b", "김준육"));
        System.out.println(strMap.remove("b", "김준이"));


        // 값 반복으로 출력
//        for (Map.Entry<String, String> entry : strMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

        System.out.println(strMap.entrySet());
        for (Map.Entry<String, String> entry : strMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

        Set<String> valuesSet = new HashSet<>();
        valuesSet.addAll(strMap.values());
        // 중괄호 - Map , 대괄호 -> List or Array
    }
}

