package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
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
        String [] pointAll = uniqueCharacters.split(" ");
        System.out.println(Arrays.toString(pointAll) + " AllPoints arr");
        return pointAll;
    }

    public static String[] arcPoint(String[] arcString, HashMap<String, Integer> hashFinal, String[] pointAll){
        int w = 0;
        String[] arcs = new String[arcString.length];
        if (pointAll.length == hashFinal.size()) {
            System.out.println("BINGO, I hope!");
        }else {
            for (int i = 0; i <= hashFinal.size(); i++) {
                String element = pointAll[i];
                System.out.println(arcs[i] + " ##############");
                if (arcString[i].contains(element)) {

                }
            }

        }
        return arcs;
    }



    public static void main(String[] args) {
        DijkstraAlg alg = new DijkstraAlg();

        addToHash(arcInt, arcString, alg.hashInt, alg.hashStr); //put elements to 2 hashMap mirror

        final String[] pointAll = pointArr(arcString); // all points (Up letters)

        String[] arcPointReturn = arcPoint(arcString, alg.hashFinal, pointAll);
        System.out.println(Arrays.toString(arcPointReturn) + "  arcPointReturn");

        System.out.println(Arrays.toString(arcString) + "  arcString");


        String[] realPoint = new String[pointAll.length];
        for (int i = 0; i < realPoint.length; i++) {
            if (alg.hashFinal.get(pointAll[i]) != null) {
                realPoint[i] = pointAll[i];
                System.out.println((Arrays.toString(realPoint)) + "  realPoint");
            }
        }






    }
}
