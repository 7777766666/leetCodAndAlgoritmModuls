package org.example.deikstr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
        String uniqueCharacters = Arrays.stream(arcString)
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .mapToObj(x -> Character.toString((char) x))
                .collect(Collectors.joining(" "));
        String[] pointAll = uniqueCharacters.split(" ");
        System.out.println(Arrays.toString(pointAll) + " AllPoints arr");
        return pointAll;
    }
    //return [AB, AD, null, null, null, AA] for A
//    public static String[] arcPoint(String[] arcString, HashMap<String, Integer> hashFinal, String[] pointAll) {
//        String[] arcs = new String[arcString.length];
//        if (pointAll.length == hashFinal.size()) {
//            System.out.println("BINGO, I hope!");
//        } else {
//            for (int i = 0; i <= hashFinal.size(); i++) {
//                String element = pointAll[i];
//                System.out.println(arcs[i] + " ##############");
//                for (int j = 0; j < arcString.length; j++) {
//                    if (arcString[j].contains(element)) {
//                        //стрим фильтрующий по элементам
//
//
//                        arcs[j] = arcString[j];
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arcs) + " arcs A letter");
//        return arcs;
//    }


    public static String[] shortest(HashMap<String, Integer> hashFinal, String[] pointAll, String[] pointFinalStr) {
        String[] forChooseArc = new String[arcString.length];
        if (hashFinal.size() == 0) {
            hashFinal.put(pointAll[0], 0);
            pointFinalStr[0] = pointAll[0];
        }

        for (int i = 0; i < pointFinalStr.length; i++) {
            if (pointFinalStr[i] != null) {
                for (int w = 0; w < arcString.length; w++) {
                    if (arcString[w].contains(pointFinalStr[i])) {
                        forChooseArc[w] = arcString[w]; //all arc, which contains pointFinalStr
                    }
                }

            }

        }  return forChooseArc;
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

        final String[] pointAll = pointArr(arcString); // all points (Up letters)
        final String[] pointFinalStr = new String[pointAll.length]; //array of real Points with null initial

//        String[] arcPointReturn = arcPoint(arcString, alg.hashFinal, pointAll);  //[AB, AD, null, null, null, AA] for A

        String[] shortestLength = shortest(alg.hashFinal, pointAll, pointFinalStr);


        System.out.println(Arrays.toString(shortestLength) + "  shortestLength");




    }
}
