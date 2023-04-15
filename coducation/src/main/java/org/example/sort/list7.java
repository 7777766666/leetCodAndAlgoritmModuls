package org.example.sort;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.example.sort.RealEnum.BLOCKED;
import static org.example.sort.RealEnum.CREATED;
import static org.example.sort.RealEnum.EMPTY;
import static org.example.sort.RealEnum.PAUSED;

public class list7 {

    private static EnumComporator enumComporator = new EnumComporator();

    public static void main(String[] args) {

        List<RealEnum> enumList = new ArrayList<>();
        enumList.add(CREATED);
        enumList.add(BLOCKED);
        enumList.add(PAUSED);
        enumList.add(BLOCKED);
        enumList.add(EMPTY);

        enumList.add(EMPTY);
//        enumList.add(ACTIVE);

        List<String> list = new ArrayList<>();
//        list.add("CREATED");
        list.add("PAUSED");
        list.add("BLOCKED");
        list.add("EMPTY");
        list.add("BLOCKED");
        list.add("EMPTY");
//        list.add("ACTIVE");

//        System.out.println(factorial(36));
        System.out.println(sss(enumList));
        System.out.println((SortMethod.zzz(list)) + "  sorClass");

//        System.out.println(mem(list));

//        1. Если есть хотя бы один договор в статусе ACTIVE или CREATED, статус будет ACTIVE
//        2. Если нет договоров в статусе из п.1, но есть хотя бы один договор в статусе PAUSED, статус будет PAUSED
//        3. Если нет договоров в статусе из п.1 и п.2, но есть хотя бы один договор в статусе BLOCKED, статус будет BLOCKED
//        4. Иначе статус будет EMPTY


    }

    public static RealEnum sss(List<RealEnum> enumList) {
        enumList.sort(enumComporator);
//        if (enumList.get(0).equals(CREATED)) {
//            return ACTIVE;
//        }
        return  enumList.get(0);
    }

    static class EnumComporator implements Comparator<RealEnum>{
        @Override
        public int compare(RealEnum o1 , RealEnum o2) {
            return o1.ordinal() - o2.ordinal();
        }
    }

public static String zzz(List<String> list) {
    if (list.size() == 0) {
        return "EMPTY";
    }
    if (list.size() == 1) {
        return list.get(0);
    }
    int size = 0;
    for (int i = 0; i < list.size(); i++) {
        if (list.get(i).startsWith("A") || list.get(i).startsWith("C")) {
            return "ACTIVE";
        } else if (size < 2) {
            if (list.get(i).startsWith("P")) {
                size = 2;
            } else if ( size != 1 && list.get(i).startsWith("B")) {
                size = 1;
            }
        }
    }
    return (size == 2) ? "PAUSED" : (size == 1 ? "BLOCKED" : "EMPTY");
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
            } else if (status.contains("PAUSED")) {
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

///

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


}


