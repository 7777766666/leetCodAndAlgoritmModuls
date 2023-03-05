package org.example.deikstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Algorithm {

    private static final int[] arcIntStart = {10, 5, 3, 100, 2, 0};
    private static final String[] arcStringStart = {"AB", "AD", "BC", "CD", "BD", "AA"};
    HashMap<String, Integer> hashStr = new HashMap<>();
    {
        for (int i = 0; i < arcIntStart.length; i++) {
            hashStr.put(arcStringStart[i], arcIntStart[i]);
        }

    }


    private static String[] allPoints() {    //accept all arc, return all point
        String[] uniqElements = Arrays.stream(Algorithm.arcStringStart)
                .flatMap(str -> Arrays.stream(str.split("")))
                .distinct()
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString((uniqElements)) + "  array Points");
        return uniqElements;
    }

    private static String[] arcForChose(HashMap<String, Integer> hashFinalArc, String[] allPoint,
                                        String[] arcStr, String[] finalPoint) {
        String[] tempArc = new String[arcStr.length];   // all arcs, which possible short way
        if (hashFinalArc.size() == 0) {
            hashFinalArc.put(allPoint[0], 0);
            finalPoint[0] = allPoint[0];
        }
        for (int i = 0; i <arcStr.length ; i++) {
            for (String str : finalPoint) {
                if (arcStr[i].contains(str)) {
                    tempArc[i] = arcStr[i];
                    break;
                }
            }
        }
        tempArc = nullDel(tempArc);
        return tempArc;
    }

    private static int[] chooseArc(String[] arcVariant, String[] finalPoint, HashMap<String, Integer> hashStr,
                                  HashMap<String, Integer> hashFinalArc) {
        int[] tempArc = new int[arcVariant.length];
        for (int i = 0; i < arcVariant.length; i++) {
            for (String point : finalPoint) {
                if (arcVariant[i].contains(point)) {
                    int length = hashStr.get(arcVariant[i]) + hashFinalArc.get(point);
                    tempArc[i] = length;
                }
            }
        }
        return tempArc;
    }

    private static int minFind(int[] pointLength) {
        return Arrays.stream(pointLength)
                .min()
                .getAsInt();
    }

    private static String[] nullDel(String[] nullArr) {
        return Arrays.stream(nullArr)
                .filter(Objects::nonNull)
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        int[] arcInt = arcIntStart;
        String[] arcStr = arcStringStart;



        String[] allPoint = allPoints();  // array of all points

        HashMap<String, Integer> hashFinalArc = new HashMap<>();    //map for real points
        String[] finalPoint = new String[1];

        String[] arcVariant = arcForChose(hashFinalArc, allPoint, arcStr, finalPoint);
        System.out.println((Arrays.toString(arcVariant)) + "  arcVariant diff way сохранить для получения ребра");

        int[] pointLength = chooseArc(arcVariant, finalPoint, algorithm.hashStr, hashFinalArc);
        System.out.println(Arrays.toString(pointLength) + "  pointLength ребро не затирать, мы найдем отрезок всегда");
        int minFind = minFind(pointLength);
        System.out.println((minFind) + "  minFind minimum value");


        System.out.println(((algorithm.hashStr.size())) + "   size hashSTR");
        System.out.println((algorithm.hashStr.keySet()) + "  keys");
        System.out.println((Arrays.toString(finalPoint)) + "  finalPoints");
    }
}
