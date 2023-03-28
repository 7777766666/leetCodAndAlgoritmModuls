package org.example.yandexEasy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusBtest {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\1\\test.txt"));
        String x = bufferedReader.readLine();
        String[] ints = x.split(" ");


        System.out.println(Integer.valueOf(ints[0]) + Integer.valueOf(ints[1]));
    }
}
