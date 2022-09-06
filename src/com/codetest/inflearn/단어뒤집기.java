package com.codetest.inflearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Project : CodeTest
 * Class: 단어뒤집기
 * Created by baegseungjo on 2022/09/07
 * <p>
 * Description:
 */
public class 단어뒤집기 {

    public static List<String> solution(List<String> list) {
        return
                list
                        .stream()
//                        .map(str -> new StringBuilder(str).reverse().toString())
                        .map(str -> {
                            char[] chars = str.toCharArray();
                            int lt = 0;
                            int rt = chars.length - 1;

                            while(lt < rt) {
                                char tmp = chars[lt];
                                chars[lt] = chars[rt];
                                chars[rt] = tmp;
                                lt++;
                                rt--;
                            }

                            return new String(chars);
                        })
                        .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int count = Integer.parseInt(kb.nextLine());
        List<String> inputs = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            inputs.add(kb.nextLine());
        }

        System.out.println(String.join("\n", solution(inputs)));
    }

//    public static List<String> solution(int n, String[] str) {
//        List<String> answer = new ArrayList<>();
//        for (String x : str) {
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Scanner kb = new Scanner(System.in);
//        int n = kb.nextInt();
//        String[] str = new String[n];
//        for (int i = 0; i < n; i++) {
//            str[i] = kb.next();
//        }
//
//        for (String x : solution(n, str)) {
//            System.out.println(x);
//        }
//    }
}
