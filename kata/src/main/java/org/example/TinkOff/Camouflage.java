package org.example.TinkOff;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

    class Camouflage   {
        public static void main(String args[]) throws UnsupportedEncodingException {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
//            input = "РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±.";
            String decode = decode(input);


            System.out.println(decode);
        }

        public static String decode(String input) {
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ,.";
            String key = "pqwertyuiopasdfghjklzxcvbnm1234567890 .,";
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                int index = alphabet.indexOf(c);
                if (index == -1) {
                    result.append(c);
                } else {
                    result.append(key.charAt(index));
                }
            }
            return result.toString();
        }


    }


//    Камуфляж и шпионаж 🕵️
//        Необходимо написать функцию, которая декодирует и расшифровывает строку.
//
//        Ограничения
//        Функция должна принимать на вход строку;
//        Функция должна возвращать строку.
//        Пример
//        Входные параметры:
//
//        РҐРѕС‰СѓСЏ СЋСЉРЅР¶СѓР±, Рѕ С‘РѕС€СЊС‡С‰ СЋСЉРѕС‘СѓР±.
//        Выходные параметры:
//
//        Хакер пляшет, а чайник плачет.
//        Подсказка:
//
//        о - к - н - а
//
//        Произошла ошибка
//        Camouflage.java:20: error: cannot find symbol
//        byte[] bytes = input.getBytes(Charset.forName("windows-1251"));
//        ^
//        symbol:   variable Charset
//        location: class Camouflage
//Camouflage.java:22: error: cannot find symbol
//        String decoded = new String(bytes, Charset.forName("UTF-8"));
//        ^
//        symbol:   variable Charset
//        location: class Camouflage...



// допишите метод main

//import java.util.*;
//        import java.lang.*;
//
//class Camouflage
//{
//    public static void main(String args[])
//    {
//        var scanner = new Scanner(System.in);
//        var input = scanner.nextLine();
//
//        // декодируйте строку
//
//        String result = "декодированный текст";
//
//        System.out.println(result);
//    }
//}