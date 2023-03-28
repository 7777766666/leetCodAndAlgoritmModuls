package org.example.YYYY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));


        int w = Integer.parseInt(bufferedReader.readLine());
        String[] split = bufferedReader.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            split = bufferedReader.readLine().split("x");
            int width = Integer.parseInt(split[0]);
            int height = Integer.parseInt(split[1]);
            int newH = (int) Math.ceil((double) height * w / width);
            heights[i] = newH;
        }

        Arrays.sort(heights);
        int[] selectedHeights = Arrays.copyOfRange(heights, n - k, n);

        int minH = selectedHeights[0];
        int maxH = selectedHeights[k - 1];
        bufferedWriter.write(String.valueOf(minH));
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(maxH));


        bufferedReader.close();
        bufferedWriter.close();



    }

}
