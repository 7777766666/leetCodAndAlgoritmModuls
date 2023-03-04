package org.example.deikstr;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class DijkstraAlg {

    private static final int[] arcInt = {10, 5, 3, 100, 2, 0};
    private static final String[] arcString = {"AB", "AD", "BC", "CD", "BD", "AA"};
    HashMap<Integer, String> hashInt = new HashMap<>();
    HashMap<String, Integer> hashStr = new HashMap<>();
    HashMap<String, Integer> hashFinal = new HashMap<>();


    public static void addToHash(int[] arcInt, String[] arcString,
                                 HashMap<Integer, String> hashInt, HashMap<String, Integer> hashStr) {
        for (int i = 0; i < arcInt.length; i++) {
            hashInt.put(arcInt[i], arcString[i]);
            hashStr.put(arcString[i], arcInt[i]);
        }
        System.out.println(hashInt + "  hashInt");
        System.out.println(hashStr + "  hashStr");
    }

    public static String[] pointArr(String[] arcString) {

        String[] pointAll = Arrays.stream(arcString)
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .sorted()
                .mapToObj(x -> String.valueOf((char) x))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(pointAll) + " AllPoints arr");
        return pointAll;
    }


    public static String[] arcWithPoint(HashMap<String, Integer> hashFinal, String[] pointAll, String[] pointFinalStr) {
        String[] forChooseArc = new String[arcString.length];
        if (hashFinal.size() == 0) {
            pointFinalStr[0] = pointAll[0];
            hashFinal.put(pointFinalStr[0], 0);

        }
        for (int i = 0; i < pointFinalStr.length; i++) {
            if (pointFinalStr[i] != null) {
                for (int w = 0; w < arcString.length; w++) {
                    if (arcString[w].contains(pointFinalStr[i])) {
                        forChooseArc[w] = arcString[w]; //all arc, which contains pointFinalStr
                    }
                }
            }
        }
        return forChooseArc;
    }

    public static void minValue(String[] shortestLength, String[] pointFinalStr,
                                   HashMap<String, Integer> hashFinal, HashMap<String, Integer> hashStr) {


        Integer[] minWay = new Integer[shortestLength.length];
        for (int i = 0; i < pointFinalStr.length; i++) {

            if (pointFinalStr[i] != null) {
                for (int w = 0; w < shortestLength.length; w++) {
                    if (shortestLength[w] != null) {
                        Integer intPoint = hashFinal.get(pointFinalStr[i]);
                        Integer intArc = hashStr.get(shortestLength[w]);
                        Integer pointPlusArc = (intPoint + intArc);
                        minWay[w] = pointPlusArc;
                    }
                }
            }
        }
        System.out.println((Arrays.toString(minWay)) + "  minWay");
        int minWayNew = minResult(minWay);              // минимальное значение из массива
        String realShort = arcShortest(shortestLength, minWayNew, hashStr);
        System.out.println(minWayNew + "  minWayNew  + realShort  " + realShort);
        String forFinalAddPoint = pointToADDFinal(realShort, pointFinalStr);
        System.out.println(forFinalAddPoint + "    forFinalAddPoint ");
        hashFinal.put(forFinalAddPoint, minWayNew);
        pointFinalStr[hashFinal.size() - 1] = forFinalAddPoint;
        System.out.println(Arrays.toString(pointFinalStr) + "   pointFinalStr in inValue");
        System.out.println((hashStr.size()) + "   hashStr size before dell");
        hashStr.remove(realShort);
        System.out.println((hashStr.size()) + "  hashStr size after dell");
    }

    private static int minResult(Integer[] minWay) {
        return Arrays.stream(minWay)
                .filter(Objects::nonNull)
                .min(Integer::compareTo)
                .orElse(-1000);
    }

    private static String arcShortest(String[] shortestLength, int minWayNew, HashMap<String, Integer> hashStr) {
        for (int i = 0; i < shortestLength.length; i++) {
            if (shortestLength[i] != null &&  minWayNew == hashStr.get(shortestLength[i])) {
                String realShortP =  shortestLength[i];
                return realShortP;
            }
        }
        return "ERROR!!!!";
    }

    private static String pointToADDFinal(String realShort, String[] pointFinalStr){
        for (int i = 0; i < pointFinalStr.length; i++) {
            if (pointFinalStr[i] != null) {
                if (realShort.contains(pointFinalStr[i])) {
                    String[] arcSplit = new BufferedReader(new StringReader(realShort)) //arc to arr 2 parts
                            .lines()
                            .flatMap(str -> Arrays.stream(str.split("")))
                            .toArray(String[]::new);
                    if (realShort.equalsIgnoreCase(arcSplit[0])){
                        return arcSplit[1];
                    } else {
                        return arcSplit[0];
                    }
                }
            }
        }
        return "ERROR from pointToADDFinal";
    }



    private static void savePoint(Integer minWayNew, String realShort, HashMap <String, Integer> hashFinal,
                                  String[] pointFinalStr) throws FileNotFoundException {
        String[] splitArc = new BufferedReader(new StringReader(realShort))
                .lines()
                .flatMap(str -> Arrays.stream(str.split("")))
                .toArray(String[]::new);
//        if (splitArc[0].equalsIgnoreCase())


        hashFinal.put(realShort, minWayNew);

    }

    private static String[] strToArr(String realShort) {
        return new BufferedReader(new StringReader(realShort))
                .lines()
                .flatMap(str -> Arrays.stream(str.split("")))
                .toArray(String[]::new);
    }

    public static String[] arcToLetters(String[] arcPointReturn) {  //принимаем ребра, возвращаем точки
        ArrayList<String> toList = Arrays.stream(arcPointReturn)
                .filter(Objects::isNull)
                .distinct()
                .flatMap(s -> Arrays.stream(s.split("")))
                .collect(Collectors.toCollection(ArrayList::new));
        return toList.toArray(new String[0]);
    }



    public static void main(String[] args) {
        DijkstraAlg alg = new DijkstraAlg();

        addToHash(arcInt, arcString, alg.hashInt, alg.hashStr); //put elements to 2 hashMap mirror

        final String[] pointAll = pointArr(arcString); // all points sorted (Up letters)
        final String[] pointFinalStr = new String[pointAll.length]; //array of real Points with null initial


        String[] shortestLength = arcWithPoint(alg.hashFinal, pointAll, pointFinalStr);

        minValue(shortestLength, pointFinalStr, alg.hashFinal, alg.hashStr);


        System.out.println((Arrays.toString(pointFinalStr)) + "    pointFinalStr");
        System.out.println((alg.hashFinal.get(pointFinalStr[0])) + "   pointFinalStr get from hashFinal");
        System.out.println(Arrays.toString(shortestLength) + "  shortestLength");



        System.out.println((alg.hashFinal.size()) + "    hashFinal");
        System.out.println((alg.hashStr.keySet()) + " all arc after dell");


    }
}
