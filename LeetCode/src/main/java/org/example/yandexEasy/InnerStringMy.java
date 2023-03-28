package org.example.yandexEasy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class InnerStringMy {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\1\\test.txt"));
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