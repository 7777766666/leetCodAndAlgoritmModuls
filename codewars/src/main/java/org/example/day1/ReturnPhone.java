package org.example.day1;

public class ReturnPhone {

        public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\"(");
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
        stringBuilder.append("\"");
        String phone = stringBuilder.toString();
        return phone;
    }

}
