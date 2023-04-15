package org.example.TinkOff;

import java.util.*;
import java.lang.*;

public class FiveLetters100 {


    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        // разбиваем входную строку на две части
        String[] parts = input.split(", ");
        String userAnswer = parts[0];
        String correctAnswer = parts[1];

        // создаем массив для хранения результатов
        int[] result = new int[5];

        // создаем массивы для хранения частот вхождения каждой буквы в ответах
        int[] userFreq = new int[33];
        int[] correctFreq = new int[33];

        // считаем частоты вхождения букв в ответы
        for (int i = 0; i < 5; i++) {
            char userChar = userAnswer.charAt(i);
            char correctChar = correctAnswer.charAt(i);

            if (userChar == correctChar) {
                result[i] = 1; // буква на своем месте
            } else {
                userFreq[userChar - 'А']++;
                correctFreq[correctChar - 'А']++;
            }
        }

        // проверяем буквы, которые есть, но не на своих местах
        for (int i = 0; i < 33; i++) {
            char c = (char) ('А' + i);
            int userCount = userFreq[i];
            int correctCount = correctFreq[i];
            int commonCount = Math.min(userCount, correctCount);

            for (int j = 0; j < 5; j++) {
                if (result[j] == 0 && userAnswer.charAt(j) == c) {
                    if (commonCount > 0) {
                        result[j] = 0; // буква есть, но в другом месте
                        commonCount--;
                    } else {
                        result[j] = -1; // буква отсутствует
                    }
                }
            }
        }

        // формируем выходную строку
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            output.append(result[i]);
            if (i < 4) {
                output.append(", ");
            }
        }
        System.out.println(output);
    }
}


//
//        for (int i = 0; i < 5; i++) {
//            char userChar = userAnswer.charAt(i);
//            char correctChar = correctAnswer.charAt(i);
//            if (result[i] == 0) {
//                if (correctDict.containsKey(userChar) && correctDict.get(userChar) > 0) {
//                    result[i] = 0;
//                    correctDict.put(userChar, correctDict.get(userChar) - 1);
//                } else if (userDict.containsKey(correctChar) && userDict.get(correctChar) > 0) {
//                    result[i] = 0;
//                    userDict.put(correctChar, userDict.get(correctChar) - 1);
//                } else {
//                    result[i] = -1;
//                }
//            }
//        }
//
//        return result;
//    }
//}

//    public static String arrayToString(int[] array) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < array.length; i++) {
//            sb.append(array[i]);
//            if (i < array.length - 1) {
//                sb.append(", ");
//            }
//        }
//        return sb.toString();
//    }


//5 букв
//        Необходимо написать функцию, которая проверяет правильность решения для игры 5 букв.
//
//        Ограничения
//        Функция должна принимать на вход строку вида:
//        ответ пользователя, правильный ответ
//        Функция должна возвращать массив из 5 элементов, каждый элемент - это цифра отвечающая за совпадения:
//        -1: Буква отсутствует
//        0: Буква есть, но в другом месте
//        1: Буква на своём месте
//        Слова должны состоять строго из 5 букв;
//        При проверке повторяющихся букв должно учитываться их количество. Например, если в ответе ТЕКСТ есть только одна буква Е, а пользователь отправил слово ЕГЕРЬ, то только одна буква Е должна быть помечена как 0, остальные должны быть -1.
//        На выход необходимо отдать строку вида:
//        1, 0, -1, 1, -1
//        Пример
//        Входные параметры:
//
//        ДОЖДЬ, ДЗЮДО
//        Выходные:
//
//        1, 0, -1, 1, -1


//import java.util.*;
//        import java.lang.*;
//
//class FiveLetters
//{
//    public static void main(String args[])
//    {
//        var scanner = new Scanner(System.in);
//        var input = scanner.nextLine();
//
//        // здесь решение
//
//        String result = "11111";
//        System.out.println(result);
//    }
//}