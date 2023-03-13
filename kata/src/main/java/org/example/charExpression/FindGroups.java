package org.example.charExpression;

public class FindGroups {

    public static void main(String[] args) {

        int a = 13;
        System.out.println(determineGroup(a));

    }

    public static int determineGroup(int age) {
        return (age > 6 && age < 14) ? 1 : ((age > 13 && age < 18) ? 2 : ((age > 17 && age < 66) ? 3 : -1));
    }

}

// 1 - от 7 до 13 лет 2 - от 14 до 17 лет 3 - от 18 до 65 лет.