package org.example.YYYY;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Payments {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\1\\input.txt"));
        Integer n = Integer.valueOf(bufferedReader.readLine());


        int[] money = new int[n];
        int[] dayStart = new int[n];
        int[] dayEnd = new int[n];

        for (int i = 0; i < n; i++) {
            String[] split = bufferedReader.readLine().split(" ");
            money[i] = Integer.valueOf(split[0]);
            LocalDate localDateStart = LocalDate.parse(split[1] + ".2022", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            LocalDate localDateEnd = LocalDate.parse(split[2] + ".2022", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            dayStart[i] = localDateStart.getDayOfYear();
            dayEnd[i] = localDateEnd.getDayOfYear();

        }
        System.out.println((Arrays.toString(dayStart)) + "  dayStart");
        System.out.println((Arrays.toString(dayEnd)) + "   dayEnd");
        System.out.println((Arrays.toString(money)) + "  money");

        LocalDate[] endPeriods = new LocalDate[5];

        endPeriods[0] = LocalDate.of(2022, 01, 01);
        endPeriods[1] = LocalDate.of(2022, 03, 31);
        endPeriods[2] = LocalDate.of(2022, 06, 30);
        endPeriods[3] = LocalDate.of(2022, 9, 30);
        endPeriods[4] = LocalDate.of(2022, 12, 31);

        int[] partsPoints = new int[5];
        for (int i = 0; i < 5; i++) {
            partsPoints[i] = endPeriods[i].getDayOfYear();
        }
        System.out.println((Arrays.toString(partsPoints)) + "   partsPoints");

        int[] workDays = new int[n];
        int tempLeft = 0;
        int tempRight = 0;
        double daySum = 0;
        double[] sum = new double[n];
        int z = 0;
        for (int i = 0; i < n; i++) {
            if (!(dayStart[z] <= partsPoints[i] && dayEnd[z] <= partsPoints[i] ||
                    dayStart[z] > partsPoints[i + 1] && dayEnd[z] > partsPoints[i + 1])) {
                if (dayStart[z] <= partsPoints[i]) {
                    tempLeft = partsPoints[i] + 1;
                } else {
                    tempLeft = dayStart[z];
                }
                if (dayEnd[z] >= partsPoints[i + 1]) {
                    tempRight = partsPoints[i + 1];
                } else {
                    tempRight = dayEnd[z];
                }
                workDays[i] = tempRight - tempLeft + 1;
                daySum = (100 * money[i]) / (dayEnd[i] - dayStart[i] + 1) ;
                double moneyDay = daySum / 100;
                sum[i] = moneyDay * workDays[i];

                System.out.println(moneyDay + "  %%%");
                System.out.println(Arrays.toString(sum));
            }
        }

        System.out.println(Arrays.toString(workDays) + "  workdays");


    }


}
