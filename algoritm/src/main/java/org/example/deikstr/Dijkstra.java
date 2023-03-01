package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Set;


public class Dijkstra {

    public void printAll() {
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


    public Dijkstra() {

        arc.put("AD", 5);
        arc.put("AB", 10);
        arc.put("BD", 2);
        arc.put("BC", 3);
        arc.put("CD", 310);


        finalTable.put("a", 0);
        finalTable.put("b", null);    //10
        finalTable.put("c", null);    //30
        finalTable.put("d", null);    //31

    }


    public void addBestElement() {
        int count = 0;
        int[] checkInt = new int[2];
        String[] arcCheck = new String[2];
        int finalToTable = -1;

        for (int i = 0; i < allElements.length; i++) {
            if (count == 2) {
                finalToTable = i;
                break;
            }
            if (finalTable.get(allElements[i]) != null) {
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
        } else
            addAndDelete(arcCheck[1], allElements[finalToTable], checkInt[1]);
    }

    private static final String[] allElements = {"a", "b", "c", "d"};

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
        Dijkstra dijkstra = new Dijkstra();

        String strFromArr = dijkstra.pointFistName();
        System.out.println(strFromArr + "   it is strFromArr");
        String toNextPoint = dijkstra.findPoint(strFromArr);
        System.out.println(toNextPoint + "  number after find point toNextPoint");
        System.out.println(dijkstra.pointFinal() + "   point for merge FINAL");
        Integer numForPoint = dijkstra.arc.get(toNextPoint);
        dijkstra.addAndDelete(toNextPoint, dijkstra.pointFinal(), numForPoint);

        dijkstra.addBestElement();
        dijkstra.printAll();
        dijkstra.addBestElement();
        dijkstra.printAll();



    }
}
