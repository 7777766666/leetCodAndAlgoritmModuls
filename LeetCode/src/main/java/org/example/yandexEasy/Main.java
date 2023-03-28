//package org.example.yandexEasy;
//
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.time.LocalDate;
//import java.time.YearMonth;
//import java.time.YearQuarter;
//import java.time.temporal.ChronoUnit;
//
//    public class Main {
//        public static void main(String[] args) throws IOException {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//            int n = Integer.parseInt(reader.readLine());
//
//            // массив сумм оплаты за каждый квартал
//            double[] quarterlyPayments = new double[4];
//
//            // проходим по всем счетам
//            for (int i = 0; i < n; i++) {
//                String[] parts = reader.readLine().split(" ");
//                double amount = Double.parseDouble(parts[0]);
//                LocalDate dateFrom = parseDate(parts[1]);
//                LocalDate dateFinish = parseDate(parts[2]);
//
//                // вычисляем общее количество дней для данного счета
//                int totalDays = (int) ChronoUnit.DAYS.between(dateFrom, dateFinish) + 1;
//
//                // проходим по всем кварталам в году
//                for (int quarter = 1; quarter <= 4; quarter++) {
//                    YearQuarter yearQuarter = YearQuarter.of(dateFrom.getYear(), quarter);
//                    YearMonth quarterStart = yearQuarter.atMonth(1);
//                    YearMonth quarterEnd = yearQuarter.atMonth(3).atEndOfMonth();
//
//                    // вычисляем количество дней, попадающих в текущий квартал
//                    int daysInQuarter = getDaysInQuarter(dateFrom, dateFinish, quarterStart, quarterEnd);
//
//                    // вычисляем сумму оплаты за текущий квартал
//                    double quarterPayment = amount * daysInQuarter / totalDays;
//                    quarterlyPayments[quarter - 1] += quarterPayment;
//                }
//            }
//
//            // выводим суммы оплаты за каждый квартал с округлением до 2 знаков после запятой
//            for (int i = 0; i < 4; i++) {
//                writer.write(String.format("%.2f\n", quarterlyPayments[i]));
//            }
//
//            reader.close();
//            writer.close();
//        }
//
//        // метод для преобразования строки в дату
//        private static LocalDate parseDate(String dateStr) {
//            String[] parts = dateStr.split("\\.");
//            int day = Integer.parseInt(parts[0]);
//            int month = Integer.parseInt(parts[1]);
//            return LocalDate.of(2022, month, day);
//        }
//
//// метод для вычисления количества дней, попадающих в данный квартал
//
//    }
