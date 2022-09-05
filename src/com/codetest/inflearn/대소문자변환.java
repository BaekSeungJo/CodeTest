package com.codetest.inflearn;

import java.util.Scanner;

/**
 * Project : CodeTest
 * Class: 대소문자변환
 * Created by baegseungjo on 2022/09/06
 * <p>
 * Description:
 */
public class 대소문자변환 {

    public static String solution(String str) {
        String anwer = "";

//        for (char c : str.toCharArray()) {
//            anwer += Character.isLowerCase(c) ? Character.toUpperCase(c) : Character.toLowerCase(c);
//        }

        // 아스키코드 사용
        for (char c : str.toCharArray()) {
            if (c >= 97 && c <= 122) {
                anwer += (char) (c - 32);
            } else {
                anwer += (char) (c + 32);
            }
        }

        return anwer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}
