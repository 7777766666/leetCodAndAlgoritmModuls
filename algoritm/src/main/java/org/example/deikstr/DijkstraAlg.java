package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DijkstraAlg {

    private static final int[] arcInt = {10, 5, 3, 100, 2};
    private static final String[] arcString = {"AB", "AD", "BC", "CD", "BD"};
    HashMap<Integer, String> hashInt = new HashMap<>();
    HashMap<String, Integer> hashStr = new HashMap<>();

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


    public static void main(String[] args) {
        DijkstraAlg alg = new DijkstraAlg();

        addToHash(arcInt, arcString, alg.hashInt, alg.hashStr); //put elements to 2 hashMap mirror

        String[] pointAll = pointArr(arcString); // all points (Up letters)


    }
}
