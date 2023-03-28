package org.example.yandexEasy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class outputAplusB {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\1\\input.txt"));
        String[] numbers = bufferedReader.readLine().split(" ");
        int rezult = Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]);
        FileWriter fileWriter = new FileWriter("E:\\1\\output.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write(String.valueOf(rezult));
        printWriter.close();
    }
}
