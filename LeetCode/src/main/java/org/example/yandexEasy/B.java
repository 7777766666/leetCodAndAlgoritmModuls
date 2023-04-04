package org.example.yandexEasy;

// 6 баллов

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class B {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\3\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\3\\output.txt"));


        String ns = reader.readLine();
        String[] split = ns.split(" ");
        int n = Integer.valueOf(split[0]);
        int s = Integer.valueOf(split[1]);



        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            String point = reader.readLine();
            String[] pointsSplit = point.split(" ");
            x[i] = Integer.valueOf(pointsSplit[0]);
            y[i] = Integer.valueOf(pointsSplit[1]);
        }
        int[] xFirst = new int[x.length];
        int[] yFirst = new int[y.length];
        for (int i = 0; i < xFirst.length; i++) {
            xFirst[i] = x[i];
            yFirst[i] = y[i];
        }

        Arrays.sort(x);
        Arrays.sort(y);


        int xMin = x[0];
        int xMax = x[x.length - 1];
        int yMin = y[0];
        int yMax = y[y.length - 1];


        int sStart = Math.abs((xMax - xMin) * (yMax - yMin));


        int countXMinIndex = 0;
        int countXMin = 0;
        int countXMaxIndex = x.length - 1;
        int countXMax = 0;
        int countYMinIndex = 0;
        int countYMin = 0;
        int countYMaxIndex = y.length - 1;
        int countYMax = 0;
        int[] countAll = new int[4];
        int[] diff = new int[4];


        while ( x.length !=1 && y.length != 1 && sStart > s) {

            countXMinIndex = 0;
            countXMin = 0;
            countXMaxIndex = x.length - 1;
            countXMax = 0;
            countYMinIndex = 0;
            countYMin = 0;
            countYMaxIndex = y.length - 1;
            countYMax = 0;


            while ( (countXMinIndex + 1) != x.length -1 && xMin == x[countXMinIndex + 1]) {
                countXMinIndex++;
                countXMin++;
                countAll[0] = countXMin;
                if (countXMinIndex + 1 <= x.length -1 ) {
                    diff[0] = x[countXMinIndex + 1] - x[countXMinIndex];
                }else {
                    diff[0] = 0;
                }
            }
            while ( countXMaxIndex != 1 && xMax == x[countXMaxIndex - 1]) {
                countXMaxIndex--;
                countXMax++;
                countAll[1] = countXMax;
                if (countXMaxIndex -1 > 0) {
                    diff[1] = x[countXMaxIndex] - x[countXMaxIndex -1] ;
                }else {
                    diff[1] = 0;
                }
            }
            while ( countYMinIndex + 1 != y.length -1 && yMin == y[countYMinIndex + 1]) {
                countYMinIndex++;
                countYMin++;
                countAll[2] = countYMin;
                if (countYMinIndex + 1 != y.length -1) {
                    diff[2] = x[countXMinIndex + 1] - x[countXMinIndex];
                }else {
                    diff[2] = 0;
                }
            }
            while ( countYMaxIndex - 1 != 1 && yMax == y[countYMaxIndex - 1]) {
                countYMaxIndex--;
                countYMax++;
                countAll[3] = countYMax;
                if (countXMaxIndex - 1 != 1) {
                    diff[3] = x[countXMaxIndex] - x[countXMaxIndex -1];
                }else {
                    diff[3] = 0;
                }
            }


            Arrays.sort(countAll);

            int[] minusX = new int[x.length - 1];
            int[] minusY = new int[y.length - 1];



            if (countXMin == countAll[0]) {
                System.arraycopy(x, 1, minusX, 0, minusX.length);
                x = minusX;
            } else if (countXMax == countAll[0]) {
                System.arraycopy(x, 0, minusX, 0, minusX.length);
                x = minusX;
            } else if (countYMin == countAll[0]) {
                System.arraycopy(y, 1, minusY, 0, minusY.length);
                y = minusY;
            } else {
                System.arraycopy(y, 0, minusY, 0, minusY.length);
                y = minusY;
            }


            xMin = x[0];
            xMax = x[x.length - 1];
            yMin = y[0];
            yMax = y[y.length - 1];
            countAll[0] = 0;
            countAll[1] = 0;
            countAll[2] = 0;
            countAll[3] = 0;

            sStart = (xMax - xMin) * (yMax - yMin);


        }


        xMin = x[0];
        xMax = x[x.length - 1];
        yMin = y[0];
        yMax = y[y.length - 1];

        int resultCount = 0;
        String result = "";
        for (int i = 0; i < xFirst.length; i++) {
            if (xFirst[i] >= xMin && xFirst[i] <= xMax && yFirst[i] >= yMin && yFirst[i] <= yMax ) {
                resultCount++;
                if (resultCount == 1 ) {
                    result += String.valueOf(i + 1);
                }else  {
                    result += " " + String.valueOf(i + 1);
                }
            }
        }


        writer.write(String.valueOf(resultCount));
        writer.newLine();
        writer.write(result);
        reader.close();
        writer.close();
    }



}
