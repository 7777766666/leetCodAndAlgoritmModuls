package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("CREATED");
        list.add("PAUSED");
        list.add("BLOCKED");
        list.add("EMPTY");
        list.add("ACTIVE");

        System.out.println(lol1(list));
        System.out.println(mem(list));

//        1. Если есть хотя бы один договор в статусе ACTIVE или CREATED, статус будет ACTIVE
//        2. Если нет договоров в статусе из п.1, но есть хотя бы один договор в статусе PAUSED, статус будет PAUSED
//        3. Если нет договоров в статусе из п.1 и п.2, но есть хотя бы один договор в статусе BLOCKED, статус будет BLOCKED
//        4. Иначе статус будет EMPTY


    }

    public static String lol(List<String> list) {
        Set<String> status = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "ACTIVE" || list.get(i) == "CREATED") {
                return "ACTIVE";
            } else {
                status.add(list.get(i));
            }
        }
        if (status.contains("PAUSED")) {
            return "PAUSED";
        } else if (status.contains("BLOCKED")) {
            return "BLOCKED";
        }
        return "EMPTY";
    }

    public static String lol1(List<String> list) {
        Set<Integer> status = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String mem = list.get(i);
            if (mem == "ACTIVE" || mem == "CREATED") {
                return "ACTIVE";
            } else if (status.contains("PAUSED")){
                    status.add(1);
            } else if (status.contains("BLOCKED")) {
                status.add(2);
            } else if (status.contains("EMPTY")) {
                status.add(3);
            }
        }
        return "EMPTY";
    }

    public static String mem(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.contains("ACTIVE") || list.contains("CREATED")) {
                return "ACTIVE";
            } else if (list.contains("PAUSED")) {
                return "PAUSED";
            } else if (list.contains("BLOCKED")) {
                return "BLOCKED";
            }
        }
        return "EMPTY";
    }
}


