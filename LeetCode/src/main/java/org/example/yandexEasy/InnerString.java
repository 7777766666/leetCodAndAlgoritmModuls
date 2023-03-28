package org.example.yandexEasy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InnerString {

    public static void main(String[] args) throws Exception {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String j1 = bufferedReader.readLine();
        String s1 = bufferedReader.readLine();

        String[] s = s1.split("");
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (j1.contains(s[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}