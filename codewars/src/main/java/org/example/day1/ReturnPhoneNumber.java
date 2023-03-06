package org.example.day1;


/**
 * Напишите функцию, которая принимает массив из 10 целых чисел (от 0 до 9),
 * которая возвращает строку этих чисел в виде номера телефона.
 * Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
 */
public class ReturnPhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int i = 0; i < 3; i++) {
            stringBuilder.append(numbers[i]);
        }
        stringBuilder.append(") ");
        for (int i = 3; i < 6; i++) {
            stringBuilder.append(numbers[i]);
        }
        stringBuilder.append("-");
        for (int i = 6; i < numbers.length; i++) {
            stringBuilder.append(numbers[i]);
        }
//        stringBuilder.append("\"");
        String phone = stringBuilder.toString();
        return phone;
    }
}


