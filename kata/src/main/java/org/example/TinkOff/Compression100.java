package org.example.TinkOff;




import java.util.*;
import java.lang.*;

class Compression100 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> compressedList = new ArrayList<>();

        String[] arr = input.split(", ");

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].equals(arr[i-1])) {
                count++;
            } else {
                compressedList.add("(" + arr[i-1] + ", " + count + ")");
                count = 1;
            }
        }
        compressedList.add("(" + arr[arr.length-1] + ", " + count + ")");

        String result = String.join(", ", compressedList);
        System.out.println(result);
    }
}


//    Сжатие самоизолирующихся последовательностей 📉
//        Текст задачи
//        Написать функцию, которая будет принимать на вход массив чисел и отдавать сжатые последовательности в виде массива кортежей.
//
//        Ограничения
//        Функция должна принимать на вход строку с числами вида:
//        1, 2, 2, 3, 4, 3, 3, 3
//        Функция должна возвращать массив кортежей с числами
//        Каждый элемент кортежа должен удовлетворять формату:
//        (x, y)
//        x - число из последовательности;
//        y - количество раз, которое это число встречается в последовательности.
//        На выход необходимо отдать строку вида:
//        (1, 1), (2, 2), (3, 1), (4, 1), (3, 3)
//        Пример
//        Входные параметры:
//
//        1, 2, 2, 3, 4, 3, 3, 3
//        Выходные:
//
//        (1, 1), (2, 2), (3, 1), (4, 1), (3, 3)
