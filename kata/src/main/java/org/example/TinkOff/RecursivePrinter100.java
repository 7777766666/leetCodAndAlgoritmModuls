package org.example.TinkOff;


import java.util.Scanner;

class RecursivePrinter100 {


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var inputNumber = Integer.parseInt(scanner.nextLine());
        if (inputNumber >= 1) {
            print(1, inputNumber);
        }
    }

    public static void print(int currentNumber, int n) {
        if (currentNumber <= n) {
            System.out.println(currentNumber);
            print(currentNumber + 1, n);
        }
    }
}



//class RecursivePrinter
//{
//    public static void main(String[] args) {
//        var scanner = new Scanner(System.in);
//        var inputNumber = Integer.parseInt(scanner.nextLine());
//        print(inputNumber);
//    }
//
//    public static void print(int n) {
//        // реализуйте этот метод
//    }
//}


//    Рекурсивная печать
//    Текст задачи
//    На вход приходит n. Необходимо вывести в консоль числа от 1 до n, используя рекурсию. Если n < 1 - ничего не выводить.
//
//        Ограничения
//        n > 0;
//        если n < 1, ничего не выводить;
//        для вывода каждого числа использовать System.out.println.
//        Пример
//        n = 3
//        Вывод:
//        1
//        2
//        3
//        n = 1
//        Вывод
//        1
//        n = 0
//        Ничего не выводить
//        n = -1
//        Ничего не выводить