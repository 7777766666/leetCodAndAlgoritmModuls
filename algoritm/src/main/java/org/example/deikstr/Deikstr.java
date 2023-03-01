package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;

public class Deikstr {

    public void soutAll() {
        System.out.println(finalTable.size()
                + "  a element  " + finalTable.get("a")
                + "  b element  " + finalTable.get("b")
                + "  c element  " + finalTable.get("c")
                + "  d element  " + finalTable.get("d")
                + "  arc size  " + arc.size()
        );


    }

    HashMap<String, Integer> arc = new LinkedHashMap<>();

    HashMap<String, Integer> finalTable = new LinkedHashMap<>();

    public Deikstr() {

        arc.put("AB", 10);
        arc.put("AD", 30);
        arc.put("BC", 21);
        arc.put("BD", 25);
        arc.put("CD", 30);

        finalTable.put("a", 0);
        finalTable.put("b", null);    //10
        finalTable.put("c", null);    //30
        finalTable.put("d", null);    //31
    }

    public int addBestElement() {
        int count = 0;
        int[] checkInt = new int[2];
        String[] checkString = new String[2];
        String[] arcCheck = new String[2];
        int finalToTable = -1;

        for (int i = 0; i < allElements.length; i++) {
            if (count == 2) {
                finalToTable = i;
                break;
            }
            if (finalTable.get(allElements[i]) != null) {
                checkString[count] = allElements[i];
                String element = allElements[i];
                Optional<String> pointChoose = point(element.toUpperCase());
                if (pointChoose.isPresent()) {
                    arcCheck[count] = pointChoose.get().toUpperCase();

                    Integer arcWay = arc.get(pointChoose.get());
                    Integer intFinalTable = finalTable.get(element.toLowerCase());
                    int forChoose = arcWay + intFinalTable;
                    checkInt[count++] = forChoose;

                    System.out.println(Arrays.toString(checkInt));
                }

            }
        }
        if (checkInt[1] == 0 || checkInt[0] <= checkInt[1]) {
            addAndDelete(arcCheck[0], allElements[finalToTable], checkInt[0]);
            return checkInt[0];
        } else
            addAndDelete(arcCheck[1], allElements[finalToTable], checkInt[1]);
        return checkInt[1];

    }

    static String[] allElements = {"a", "b", "c", "d"};

    public String pointFistName() {
        String element = "";
        for (int i = 1; i < allElements.length; i++) {
            if (finalTable.get(allElements[i]) == null) {
                element = allElements[i - 1].toUpperCase();
                break;
            }
        }
        return element;
    }

    public String pointSecondName(String str1) {
        String str2 = "";
        for (int i = 0; i < allElements.length; i++) {
            if (allElements[i].equalsIgnoreCase(str1)) {
                str2 = allElements[i + 1].toUpperCase();
                break;
            }
        }
        return str2;
    }

    public String pointFinal() {
        String element = "";
        for (int i = 1; i < allElements.length; i++) {
            if (finalTable.get(allElements[i]) == null) {
                element = allElements[i].toLowerCase();
                break;
            }
        }
        return element;
    }

    public Optional<String> point(String str) {
        Set<String> set = arc.keySet();
        return set.stream()
                .filter(key -> key.contains(str))
                .findFirst();
    }

    public String findPoint(String strFromArr) {
        Optional<String> pointStart = point(strFromArr);
        System.out.println(pointStart + "  lol");
        if (pointStart.isPresent()) {
            System.out.println(pointStart.get() + "   !!!!!!!!!!");
            Integer pointFind = arc.get(pointStart.get());
            System.out.println(pointFind + "  letter  " + strFromArr);
            return pointStart.get();
        }
        return "";
    }

    public void addAndDelete(String toNextPoint, String forMergeString, Integer integer) {
        finalTable.put(forMergeString, integer);
        arc.remove(toNextPoint);
    }


    public static void main(String[] args) {
        Deikstr deikstr = new Deikstr();

        String strFromArr = deikstr.pointFistName();
        System.out.println(strFromArr + "   it is strFromArr");
        String toNextPoint = deikstr.findPoint(strFromArr);
        System.out.println(toNextPoint + "  number after find point toNextPoint");
        System.out.println(deikstr.pointFinal() + "   point for merge FINAL");
        Integer numForPoint = deikstr.arc.get(toNextPoint);
        deikstr.addAndDelete(toNextPoint, deikstr.pointFinal(), numForPoint);

        deikstr.addBestElement();
        deikstr.soutAll();
        deikstr.addBestElement();
        deikstr.soutAll();


    }
}
