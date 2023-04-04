package org.example.YYYY;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class A {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\3\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\3\\output.txt"));


        String ns = reader.readLine();
        String[] split = ns.split(" ");
        int n = Integer.valueOf(split[0]);
        int s = Integer.valueOf(split[1]);

        System.out.println(n + " n s " + s);

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            String point = reader.readLine();
            String[] pointsSplit = point.split(" ");
            x[i] = Integer.valueOf(pointsSplit[0]);
            y[i] = Integer.valueOf(pointsSplit[1]);
        }
        int[] xFirst = new int[x.length];
        int[] x1 = new int[x.length];
        int[] yFirst = new int[y.length];
        int[] y1 = new int[y.length];
        for (int i = 0; i < xFirst.length; i++) {
            xFirst[i] = x[i];
            x1[i] = x[i];
            yFirst[i] = y[i];
            y1[i] = y[i];
        }
        System.out.println((Arrays.toString(xFirst)) + "   X start");
        System.out.println((Arrays.toString(yFirst)) + "  Y start");

        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Arrays.toString(x) + " x y " + Arrays.toString(y) + "   afterSort");

        int xMin = x[0];
        int xMax = x[x.length - 1];
        int yMin = y[0];
        int yMax = y[y.length - 1];

        System.out.println(xMin + " " + xMax + " <-x                       y->" + yMin + " " + yMax + " ");

        int sStart = Math.abs((xMax - xMin) * (yMax - yMin));
        System.out.println(sStart + " sStart площадь начальная");
        System.out.println(s + " s площадь заданная");

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
        System.out.println(Arrays.toString(x)  + "  old " + Arrays.toString(y));

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
            System.out.println((Arrays.toString(countAll) ) + "  ALL");

            Arrays.sort(countAll);
            System.out.println((Arrays.toString(countAll) ) + "  ALL SORT");
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


            System.out.println(Arrays.toString(x)  + "  new " + Arrays.toString(y));
            xMin = x[0];
            xMax = x[x.length - 1];
            yMin = y[0];
            yMax = y[y.length - 1];
            countAll[0] = 0;
            countAll[1] = 0;
            countAll[2] = 0;
            countAll[3] = 0;

            sStart = (xMax - xMin) * (yMax - yMin);



            System.out.println(countXMin + " " + countXMax + " " + countYMin + " " + countYMax);


            System.out.println(Arrays.toString(x) + " x  y " + Arrays.toString(y));
        }
        System.out.println(sStart + "  площадь конечная");

        xMin = x[0];
        xMax = x[x.length - 1];
        yMin = y[0];
        yMax = y[y.length - 1];
        StringBuilder stringBuilder = new StringBuilder();

        System.out.println((Arrays.toString(xFirst)) + "   X start");
        System.out.println((Arrays.toString(yFirst)) + "  Y start");
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

        System.out.println((Arrays.toString(x1)) + " x1 y1 " + (Arrays.toString(y1)));

        Arrays.sort(x1);
        Arrays.sort(y1);
        int[] tempXwhithY = new int[xFirst.length];
        int[] tempYwhithX = new int[yFirst.length];

        int xxx = find(x1);
        int yyy = find(y1);
        for (int i = 0; i < xFirst.length; i++) {
            if (xxx == x1[i]) {
                tempYwhithX[i] = yFirst[i];
            }else {
                tempYwhithX[i] = -5000;
            }
        }
        for (int i = 0; i < yFirst.length; i++) {
            if (yyy == x1[i]) {
                tempXwhithY[i] = xFirst[i];
            }else {
                tempXwhithY[i] = -6000;
            }
        }
        Arrays.sort(tempXwhithY);
        Arrays.sort(tempYwhithX);
        int ySum = findSum(tempXwhithY, s);
        int xSum = findSum(tempYwhithX, s);
        System.out.println(Arrays.toString(tempXwhithY) + " %%%% " + Arrays.toString(tempYwhithX));

        System.out.println(ySum + " !!!!!!!!!!! " + xSum);






        System.out.println("It is not cicle!!!!!!!!!!!!!!");
        System.out.println(resultCount);
        System.out.println(result);
        writer.write(String.valueOf(resultCount));
        writer.newLine();
        writer.write(result);
        reader.close();
        writer.close();
    }

    public static int find(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        int maxKey = -1;
        int maxValue = -1;

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
        }

        return maxKey;
    }
    public static int findSum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int maxSum = Integer.MIN_VALUE;

        while (left < right) {
            int sum = array[left] + array[right];
            if (sum == target) {
                return target;
            } else if (sum < target) {
                maxSum = Math.max(maxSum, sum);
                left++;
            } else {
                right--;
            }
        }

        return maxSum;
    }



}
