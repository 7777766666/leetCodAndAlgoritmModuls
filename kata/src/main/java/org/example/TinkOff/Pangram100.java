package org.example.TinkOff;

import java.util.*;
import java.lang.*;

class Pangram100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        System.out.println(isPangram);
    }

    public static boolean isPangram(String input) {
        Set<Character> alphabet = new HashSet<>(Arrays.asList('а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'));
        input = input.toLowerCase();
        for (char c : input.toCharArray()) {
            if (alphabet.contains(c)) {
                alphabet.remove(c);
                if (alphabet.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }
}


//    Съешь же ещё этих мягких французских булок, да выпей чаю 🥖
//        Необходимо написать функцию, определяющую, является ли предложение панграммой.
//
//        Панграмма - это предложение, которое содержит каждую отдельную букву алфавита по крайней мере один раз.
//
//        Например, предложение:
//
//        Съешь же ещё этих мягких французских булок, да выпей чаю.
//        является панграммой, потому что в нем используются все буквы алфавита от А до Я по крайней мере один раз.
//
//        Ограничения
//        Функция должна принимать на вход строку;
//        Функция должна возвращать булевое значение соответственно тому, является текст панграммой или нет;
//        Регистр букв не должен учитываться;
//        Все символы кроме кириллицы должны игнорироваться.
//        Пример
//        Входные параметры:
//
//        Съешь же ещё этих мягких французских булок, да выпей чаю.
//        Выходные параметры:
//
//        True