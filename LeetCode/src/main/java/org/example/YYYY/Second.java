package org.example.YYYY;
import java.util.Scanner;
public class Second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] quarterlyPayments = new double[4];

        for (int i = 0; i < n; i++) {
            double amount = scanner.nextDouble();
            String dateFrom = scanner.next();
            String dateFinish = scanner.next();

            int monthFrom = Integer.parseInt(dateFrom.split("\\.")[1]);
            int monthFinish = Integer.parseInt(dateFinish.split("\\.")[1]);

            double dailyPayment = amount / daysInMonth(monthFrom);

            for (int month = monthFrom; month <= monthFinish; month++) {
                int quarter = getQuarter(month);
                double payment = dailyPayment * daysInMonth(month);
                quarterlyPayments[quarter - 1] += payment;
            }
        }

        for (double payment : quarterlyPayments) {
            System.out.printf("%.2f%n", payment);
        }
    }

    private static int daysInMonth(int month) {
        switch (month) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    private static int getQuarter(int month) {
        switch (month) {
            case 1:
            case 2:
            case 3:
                return 1;
            case 4:
            case 5:
            case 6:
                return 2;
            case 7:
            case 8:
            case 9:
                return 3;
            default:
                return 4;
        }
    }
}
