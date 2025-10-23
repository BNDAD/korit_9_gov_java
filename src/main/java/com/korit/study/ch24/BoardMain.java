package com.korit.study.ch24;

import java.util.*;




public class BoardMain {
    public static void main(String[] args) {
        // 게시판
        /**
         * [
         *      {
         *          "title": "게시판 제목1",
         *          "writer": {
         *              "name": "김준일",
         *              "age": 32
         *          },
         *          "content": "게시판 내용1",
         *          "comments": [
         *              {
         *                  "writer": "김준이",
         *                  "content": "댓글 내용1"
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */



//        List<Map<String, Object>> boardList = new ArrayList<>();
//
//        Map<String, Object> board1 = new HashMap<>();
//        board1.put("title", "백년이의 일기");
//
//        Map<String, Object> writer1 = new HashMap<>();
//        writer1.put("name", "김백년");
//        writer1.put("age", 4);
//        board1.put("writer", writer1);
//
//        board1.put("content", "오늘 엄마가 산책을 해준다했다. 기대해");
//
//        List<Map<String, String>> comments1 = new ArrayList<>();
//        Map<String, String> comment1 = new HashMap<>();
//        comment1.put("writer", "김준이");
//        comment1.put("content", "댓글 내용1");
//        comments1.add(comment1);
//
//        Map<String, String> comment2 = new HashMap<>();
//        comment2.put("writer", "김준삼");
//        comment2.put("content", "댓글 내용2");
//        comments1.add(comment2);
//
//        board1.put("comments", comments1);
//
//        Map<String, Object> board2 = new HashMap<>();
//        board2.put("title", "게시판 제목2");
//
//        Map<String, Object> writer2 = new HashMap<>();
//        writer2.put("name", "김준사");
//        writer2.put("age", 34);
//        board2.put("writer", writer2);
//
//        board2.put("content", "게시판 내용2");
//
//        List<Map<String, String>> comments2 = new ArrayList<>();
//        Map<String, String> comment21 = new HashMap<>();
//        comment21.put("writer", "김준오");
//        comment21.put("content", "댓글 내용11");
//        comments2.add(comment21);
//
//        Map<String, String> comment22 = new HashMap<>();
//        comment22.put("writer", "김준육");
//        comment22.put("content", "댓글 내용22");
//        comments2.add(comment22);
//
//        board2.put("comments", comments2);
//
//        boardList.add(board1);
//        boardList.add(board2);
//
//
//
//        System.out.println(boardList);
//        변수 생성해서 하는거


        HashMap<String, Object> boardMap1 = new HashMap<String, Object>();
        boardMap1.put("title", "게시판 제목1");
        boardMap1.put("writer", new HashMap<String, Object>());
        ((HashMap<String, Object>) boardMap1.get("writer")).put("name", "김준일");
        ((HashMap<String, Object>) boardMap1.get("writer")).put("age", 32);
        boardMap1.put("content", "게시판 내용1");
        boardMap1.put("comments", new ArrayList<HashMap<String, String>>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(0).put("writer", "김준이");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(0).put("content", "댓글 내용1");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(1).put("writer", "김준삼");
        ((ArrayList<HashMap<String, String>>) boardMap1.get("comments")).get(1).put("content", "댓글 내용2");

        HashMap<String, Object> boardMap2 = new HashMap<String, Object>();
        boardMap2.put("title", "게시판 제목2");
        boardMap2.put("writer", new HashMap<String, Object>());
        ((HashMap<String, Object>) boardMap2.get("writer")).put("name", "김준사");
        ((HashMap<String, Object>) boardMap2.get("writer")).put("age", 30);
        boardMap2.put("content", "게시판 내용2");
        boardMap2.put("comments", new ArrayList<HashMap<String, String>>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).add(new HashMap<String, String>());
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(0).put("writer", "김준오");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(0).put("content", "댓글 내용1");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(1).put("writer", "김준육");
        ((ArrayList<HashMap<String, String>>) boardMap2.get("comments")).get(1).put("content", "댓글 내용2");

        ArrayList<HashMap<String, Object>> boardList = new ArrayList<HashMap<String, Object>>();
        boardList.add(boardMap1);
        boardList.add(boardMap2);

        System.out.println(boardList);






    }
}
