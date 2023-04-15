//package org.example.TinkOff;
//
//import java.io.*;
//import java.util.*;
//import java.lang.*;
//
//public class CalculateSum {
//
//
//    public static void main(String args[]) {
//        BufferedReader inputDataBR = new BufferedReader(new InputStreamReader(System.in));
//
//        List<Double> persents = TCupUtil.getDoubles(inputDataBR);
//        List<Double> purchases = TCupUtil.getDoubles(inputDataBR);
//
//        double sum = 0;
//        for (int i = 0; i < purchases.size(); i++) {
//            sum = sum + purchases.get(i) * persents.get(i);
//        }
//        System.out.printf("%.2f", sum);
//    }
//}
//



//Калькулятор кэшбэка 🤑
//        Текст задачи
//        Дан код, который должен поиндексно перемножать два массива (сумма покупки и процент начисляемого кэшбэка) и выводить результат — сумму кэшбэка, которую должен получить покупатель. Необходимо найти и исправить ошибку.
//
//        Ограничение
//        Метод List<Double> TCupUtil.getDoubles ( BufferedReader br) читает поток чисел из System.in. Его реализация неважна для задачи.
//        Ответ должен быть распечатан в System.out.
//        Пример
//        Входные данные:
//
//        0.1;0.02
//
//        100;300
//
//        Выходные данные:
//
//        16.0