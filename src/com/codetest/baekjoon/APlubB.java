package com.codetest.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class APlubB {

  private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws Exception {
    final String inputLine = br.readLine();
    final String[] inputs = inputLine.split(" ");
    System.out.println(Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]));
  }
}
