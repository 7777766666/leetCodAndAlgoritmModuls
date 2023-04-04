package org.example.YYYY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ScanReservYandex {


    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\1\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\1\\output.txt"));

//        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
//        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));


        String firstLine = reader.readLine();
        double newWeight = (double) Integer.valueOf(firstLine);
        String nk = reader.readLine();
        String[] splitFirst = nk.split(" ");
        Integer n = Integer.valueOf(splitFirst[0]);
        Integer k = Integer.valueOf(splitFirst[1]);
        String[] photos = new String[n];
        double[] wSize = new double[n];
        double[] hSize = new double[n];
        for (int i = 0; i < n; i++) {
            photos[i] = reader.readLine();
            String[] photoSize = photos[i].split("x");
            wSize[i] = Integer.valueOf(photoSize[0]);
            hSize[i] = Integer.valueOf(photoSize[1]);
        }

        int[] newH = new int[hSize.length];
        for (int i = 0; i < newH.length; i++) {
            newH[i] = (int) Math.ceil (hSize[i] * newWeight / wSize[i]);
        }
        Arrays.sort(newH);
        int minSend = 0;
        for (int i = 0; i < k; i++) {
            minSend += newH[i];
        }
        int maxSend = 0;
        for (int i = newH.length - k; i < newH.length; i++) {
            maxSend += newH[i];
        }
        writer.write(String.valueOf(minSend));
        writer.newLine();
        writer.write(String.valueOf(maxSend));
        writer.close();
        reader.close();
    }
}
