package org.example.yandexEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumConsol {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        String[] split = str.split(" ");
        System.out.println(Integer.valueOf(split[0]) + Integer.valueOf(split[1]));

    }
}
