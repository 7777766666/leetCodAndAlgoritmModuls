package org.example.sort;


import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        // Создаем список листов со случайными строками
        List<List<String>> lists = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 5; j++) {
                list.add(getRandomString());
            }
            lists.add(list);
        }

        List<String> testList = lists.get(0);
        System.out.println(testList);
        System.out.println(zzz(testList));


        // Запускаем метод zzz для каждого списка и замеряем время выполнения
        long startTime = System.currentTimeMillis();

        for (List<String> list : lists) {
            zzz(list);
        }

        long endTime = System.currentTimeMillis();

        long totalTime = endTime - startTime;
        System.out.println("Total time: " + totalTime + "ms");
        System.out.println("count = "+count);
    }

    private static String getRandomString() {
        final String[] states = {"CREATED", "PAUSED", "BLOCKED", "EMPTY", "ACTIVE"};
        return states[(int) (Math.random() * states.length)];
    }

    static int count=0;
    public static String zzz(List<String> list) {
        count++;
//        if (list.size() == 0) {
//            return "EMPTY";
//        }
//        if (list.size() == 1) {
//            return list.get(0);
//        }
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "ACTIVE" || list.get(i) == "CREATED") {
                return "ACTIVE";
            } else if (size < 2) {
                if (list.get(i) == "PAUSED") {
                    size = 2;
                } else if (size != 1 && list.get(i) == "BLOCKED") {
                    size = 1;
                }
            }
        }
        return (size == 2) ? "PAUSED" : (size == 1 ? "BLOCKED" : "EMPTY");
    }
}