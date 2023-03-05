package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;

public class Algoritm {

    private static final int[] arcIntStart = {10, 5, 3, 100, 2, 0};
    private static final String[] arcStringStart = {"AB", "AD", "BC", "CD", "BD", "AA"};


    private static String[] allPoints(String[] arcStringStart) {
        String[] uniqElements = Arrays.stream(arcStringStart)
                .flatMap(str -> Arrays.stream(str.split("")))
                .distinct()
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString((uniqElements)) + "  array Points");
        return uniqElements;
    }

    private static void start(HashMap<String, Integer> finalArc, String[] allPoint) {
        if (finalArc.size() == 0) {
            finalArc.put(allPoint[0], 0);
        }
    }

    public static void main(String[] args) {
        Algoritm algoritm = new Algoritm();
        int[] arcInt = arcIntStart;
        String[] arcStr = arcStringStart;

        String[] allPoint = allPoints(arcStringStart);  // array of all points

        HashMap<String, Integer> finalArc = new HashMap<>();    //map for really points

        start(finalArc, allPoint);


    }
}
