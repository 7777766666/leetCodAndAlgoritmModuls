package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;

public class Deikstr {

    HashMap<String, Integer> arc = new LinkedHashMap<>();

    HashMap<String, Integer> finalTable = new LinkedHashMap<>();

    public Deikstr() {

        arc.put("AB", 10);
        arc.put("AD", 30);
        arc.put("BC", 19);
        arc.put("BD", 25);
        arc.put("CD", 30);

        finalTable.put("a", 0);       //a = 0;
        finalTable.put("b", null);    //b = 10;
        finalTable.put("c", null);    //c = null;
        finalTable.put("d", null);
    }
    public int addBestElement() {
        int count = 0;
        int[] check = new int[2];

        for (int i = 0; i < allElements.length; i++) {

            if (finalTable.get(allElements[i]) != null) {
               String element = allElements[i];
               Optional<String> pointChoose = point(element.toUpperCase());
               if (pointChoose.isPresent()){
                   Integer arcWay = arc.get(pointChoose.get());
                   Integer intFinalTable = finalTable.get(element.toLowerCase());
                   int forChoose = arcWay + intFinalTable;
                   check[count++] = forChoose;

                   System.out.println(Arrays.toString(check));
               }
                if (count == 2)
                    break;
           }
        }
        if (check[1] == 0 || check[0] <= check[1]){
            return check[0];
        } else
            return check[1];

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
        int bestElement = deikstr.addBestElement();


        System.out.println(deikstr.finalTable.size()
                + "  a element  " + deikstr.finalTable.get("a")
                + "  b element  " + deikstr.finalTable.get("b")
                + "  c element  " + deikstr.finalTable.get("c")
                + "  d element  " + deikstr.finalTable.get("d")
                + "  arc size  " + deikstr.arc.size()
        );

    }
}
