package org.example.TinkOff;

//'main' method must be in a class 'Rextester'

import java.util.*;
import java.lang.*;

class Letters {
    public static void main(String args[]) {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();

        String result = Rextester.getUniqueCombinationsString(input);

//        String result = "a, ab, abc";
        System.out.println(result);
    }
}

class Rextester {
    public static String getUniqueCombinationsString(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] chars = s.toCharArray();
        boolean[] used = new boolean[chars.length];
        StringBuilder sb = new StringBuilder();
        generateUniqueCombinations(chars, used, sb, result);
        Collections.sort(result);
        return String.join(", ", result);
    }

    private static void generateUniqueCombinations(char[] chars, boolean[] used, StringBuilder sb, ArrayList<String> result) {
        if (sb.length() > 0) {
            result.add(sb.toString());
        }
        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {
                used[i] = true;
                sb.append(chars[i]);
                generateUniqueCombinations(chars, used, sb, result);
                sb.deleteCharAt(sb.length() - 1);
                used[i] = false;
            }
        }
    }
}

//    Помоги буквам найти свою пару 💛
//        Написать функцию, которая находит все уникальные символьные комбинации из заданной строки.
//        Например, для строки
//
//        abc
//        уникальные комбинации будут
//
//        a, ab, abc, ac, acb, b, ba, bac, bc, bca, c, ca, cab, cb, cba
//        Ограничения
//        Функция должна принимать на вход строку, для которой нужно найти уникальные комбинации;
//        Функция должна возвращать список всех уникальных комбинаций в заданной строке;
//        Функция должа возвращать результат в отсортированном виде;
//        На выход необходимо отдать строку вида:
//        a, ab, abc
//        Пример
//        Входные параметры:
//
//        abc
//        Выходные:
//
//        a, a


//import java.util.*;
//        import java.lang.*;
//
//class Letters
//{
//    public static void main(String args[])
//    {
//        var scanner = new Scanner(System.in);
//        var input = scanner.nextLine();
//
//        // здесь решение
//
//        String result = "a, ab, abc";
//        System.out.println(result);
//    }
//}

//'main' method must be in a class 'Rextester'