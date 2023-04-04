package Yandex100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Payments100 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("E:\\1\\2\\input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\1\\2\\output.txt"));


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));


        Locale.setDefault(Locale.US);
        String nnn = reader.readLine();
        Integer n = Integer.valueOf(nnn);
        int[] money = new int[n];
        int[] dayStart = new int[n];
        int[] dayEnd = new int[n];
        for (int i = 0; i < n; i++) {
            String[] split = reader.readLine().split(" ");
            money[i] = Integer.valueOf(split[0]);
            LocalDate localDateStart = LocalDate.parse(split[1] + ".2022", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            LocalDate localDateEnd = LocalDate.parse(split[2] + ".2022", DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            dayStart[i] = localDateStart.getDayOfYear();
            dayEnd[i] = localDateEnd.getDayOfYear();
        }
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
        partsPoints[0] = 0;
        double[] perDayMoney = new double[n];
        for (int i = 0; i < n; i++) {
            int perDayBefor = (int) ((double) 100 * money[i] / (double) (dayEnd[i] - dayStart[i] + 1));
            double moneyDay = (double) perDayBefor / (double) 100;
            perDayMoney[i] = moneyDay;

        }
        int[] workDays = new int[partsPoints.length - 1];
        int tempLeft = 0;
        int tempRight = 0;
        double[] sum = new double[partsPoints.length - 1];
        int t = 0;
        while (t < n) {
            for (int i = 0; i < partsPoints.length - 1; i++) {
                if (!(dayStart[t] <= partsPoints[i] && dayEnd[t] <= partsPoints[i] ||
                        dayStart[t] > partsPoints[i + 1] && dayEnd[t] > partsPoints[i + 1])) {
                    if (dayStart[t] <= partsPoints[i] + 1) {
                        tempLeft = partsPoints[i] + 1;
                    } else {
                        tempLeft = dayStart[t];
                    }
                    if (dayEnd[t] >= partsPoints[i + 1]) {
                        tempRight = partsPoints[i + 1];
                    } else {
                        tempRight = dayEnd[t];
                    }
                    workDays[i] = tempRight - tempLeft + 1;
                    sum[i] += (perDayMoney[t] * workDays[i]);
                }
            }
            t++;
        }
        Locale.setDefault(Locale.US);
for (int i = 0; i < sum.length; i++) {
    System.out.println(sum[i]);
    writer.write(String.format("%.2f", sum[i]));
            writer.newLine();
        }
        writer.close();
        reader.close();
    }
}
