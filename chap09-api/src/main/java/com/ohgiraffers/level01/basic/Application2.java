package com.ohgiraffers.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine().toLowerCase().replaceAll("[^a-z\\s]", "");
        String[] inputArr = input.split(" ");
        String maxCountInput = "";
        int maxCount = 0;

        for(int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);
            int inputCount = 1;
            for(int j = 0; j < i; j++) {
                if(inputArr[i].equals(inputArr[j])) {

                }
            }
            if(inputCount > maxCount) {
                maxCount = inputCount;
                maxCountInput = inputArr[i];
            }
        }
        System.out.println("가장 빈도 높은 단어 : " + maxCountInput + "("+maxCount+"번)");
    }
}
