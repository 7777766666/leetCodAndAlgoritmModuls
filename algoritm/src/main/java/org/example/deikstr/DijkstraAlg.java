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


    public static String[] arcWithPoint(HashMap<String, Integer> hashFinal, String[] pointAll, String[] pointFinalStr,
                                        String[] arcStringsNew) {
        String[] forChooseArc = new String[arcStringsNew.length];
//        int c = 0;
        if (hashFinal.size() == 0) {
            pointFinalStr[0] = pointAll[0];
            hashFinal.put(pointFinalStr[0], 0);

        }
        for (int i = 0; i < pointFinalStr.length; i++) {
            if (pointFinalStr[i] != null) {


                for (int w = 0; w < arcStringsNew.length; w++) {
                    if (arcStringsNew[w] != null && arcStringsNew[w].contains(pointFinalStr[i])) {  //dont wright BC CD

                        forChooseArc[w] = arcStringsNew[w]; //all arc, which contains pointFinalStr
                    }
                }
            }
        }
        return forChooseArc;
    }

    public static void minValue(String[] shortestLength, String[] pointFinalStr, HashMap<String, Integer> hashFinal,
                                HashMap<String, Integer> hashStr, String[] arcStringNew) {


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

        for (int i = 0; i < arcStringNew.length; i++) {
            if (arcStringNew[i] != null && arcStringNew[i].equalsIgnoreCase(realShort)) {
                arcStringNew[i] = null;
            }
        }

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
                    for (int j = 0; j <pointFinalStr.length; j++) {
                        if (pointFinalStr[j].contains(arcSplit[0])) {       //!!!!!!!!!!!!!
                            return arcSplit[1];
                        }
                    }
                }
            }
        }
        return "ERROR from pointToADDFinal";
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
        String[] arcStringsNew = alg.hashStr.keySet().toArray(new String[0]);

        final String[] pointAll = pointArr(arcString); // all points sorted (Up letters)
        final String[] pointFinalStr = new String[pointAll.length]; //array of real Points with null initial


        String[] shortestLength = arcWithPoint(alg.hashFinal, pointAll, pointFinalStr, arcStringsNew);

        minValue(shortestLength, pointFinalStr, alg.hashFinal, alg.hashStr, arcStringsNew);


        System.out.println((Arrays.toString(pointFinalStr)) + "    pointFinalStr");
        System.out.println((alg.hashFinal.get(pointFinalStr[0])) + "   pointFinalStr get from hashFinal");
        System.out.println(Arrays.toString(shortestLength) + "  shortestLength");

        System.out.println((alg.hashFinal.size()) + " hashFinal " + alg.hashFinal.keySet());
        System.out.println((alg.hashStr.keySet()) + " all arc after dell");

        System.out.println("----------------------------------------------------");
        System.out.println((alg.hashStr.keySet()) + "  all keys after a (not AA)");
        Object[] toArrayKeys = alg.hashStr.keySet().toArray();
        String[] stringsTest = alg.hashStr.keySet().toArray(new String[0]);
        System.out.println((Arrays.toString(stringsTest) + " test " + stringsTest.length));
        System.out.println((Arrays.toString(toArrayKeys)) + "   new keys!!!");
        String[] tttt = Arrays.copyOf(toArrayKeys, toArrayKeys.length, String[].class);
        System.out.println((Arrays.toString(tttt)) + "   new keys$$$$$$$$$$$$$$$$$");


        String[] shortestLength2 = arcWithPoint(alg.hashFinal, pointAll, pointFinalStr, arcStringsNew);
        System.out.println((Arrays.toString(shortestLength2)) + "   shortestLength2");
        minValue(shortestLength2, pointFinalStr, alg.hashFinal, alg.hashStr, arcStringsNew);
        System.out.println("-------------------------------------------------");

        String[] shortestLength3 = arcWithPoint(alg.hashFinal, pointAll, pointFinalStr, arcStringsNew);
        System.out.println((Arrays.toString(shortestLength3)) + "   shortestLength3");
        minValue(shortestLength3, pointFinalStr, alg.hashFinal, alg.hashStr, arcStringsNew);


        System.out.println("finish");

    }
}
