package org.example.deikstr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;

public class DijkstraAlg {
//    private final static String startPoint = "A";

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

    public static Integer minValue(String[] shortestLength, String[] pointFinalStr,
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
        return Arrays.stream(minWay)
                .filter(Objects::nonNull)
//                .distinct()
                .min(Integer::compareTo)
                .orElse(-1000);


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


//        String[] arcPointReturn = arcPoint(arcString, alg.hashFinal, pointAll);  //[AB, AD, null, null, null, AA] for A

        String[] shortestLength = arcWithPoint(alg.hashFinal, pointAll, pointFinalStr);

        System.out.println((Arrays.toString(pointFinalStr)) + "    pointFinalStr");
        System.out.println((alg.hashFinal.get(pointFinalStr[0])) + "   pointFinalStr get from hashFinal");
        System.out.println(Arrays.toString(shortestLength) + "  shortestLength");
//        System.out.println((Arrays.toString(sumPoint(shortestLength, pointAll, alg.hashFinal, alg.hashStr))) + "  result int");

        System.out.println(((minValue(shortestLength, pointFinalStr, alg.hashFinal, alg.hashStr))) + " == A");


    }
}
