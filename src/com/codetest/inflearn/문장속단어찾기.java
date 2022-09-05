package com.codetest.inflearn;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Project : CodeTest
 * Class: 문장속단어찾기
 * Created by baegseungjo on 2022/09/06
 * <p>
 * Description:
 */
public class 문장속단어찾기 {

    public static String solution(String str) {
        String answer = "";
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        while (tokenizer.hasMoreElements()) {
            String token = tokenizer.nextToken();
            if (token.length() > answer.length()) {
                answer = token;
            }
        }

        return answer;
    }

    public static String solution2(String str) {
        String answer = "";

        for (String s : str.split(" ")) {
            if (s.length() > answer.length()) {
                answer = s;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
}
