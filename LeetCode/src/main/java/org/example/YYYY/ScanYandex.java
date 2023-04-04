package org.example.YYYY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class ScanYandex {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\output.txt"));

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));




        double newWeight = (double) Integer.valueOf(reader.readLine());
        String nk = reader.readLine();
        String[] split = nk.split(" ");
        Integer n = Integer.valueOf(split[0]);
        Integer k = Integer.valueOf(split[1]);

        System.out.println(newWeight);
        System.out.println(n);
        System.out.println(k);

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
        System.out.println((Arrays.toString(newH)) + "   hsortFinal");
        int min = 0;
        for (int i = 0; i < k; i++) {
            min += newH[i];
        }
        System.out.println(min);
        int max = 0;
        for (int i = newH.length - k; i < newH.length; i++) {
            max += newH[i];
        }
        System.out.println(max);


        writer.write(String.valueOf(min));
        writer.newLine();
        writer.write(String.valueOf(max));
        writer.close();
        reader.close();

    }
}
