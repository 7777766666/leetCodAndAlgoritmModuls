package org.example.deikstr;

import java.lang.reflect.Array;
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

    private static String[] arcForChose(HashMap<String, Integer> hashFinalPoint, String[] allPoint,
                                        String[] arcStr, String[] finalPoint) {
        String[] tempArc = new String[arcStr.length];   // all arcs, which possible short way
        if (hashFinalPoint.size() == 0) {
            hashFinalPoint.put(allPoint[0], 2);
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

    private static void chooseArc(String[] arcVariant, String[] finalPoint, HashMap<String, Integer> hashStr,
                                  HashMap<String, Integer> hashFinalArc, String[] arcStr) {
        int[] tempArc = new int[arcVariant.length];
        HashMap<Integer, String> hashTemp = new HashMap<>();
        HashMap<String, String> hashTemp2 = new HashMap<>();
        String[] tempPoint = new String[arcVariant.length];
        for (int i = 0; i < arcVariant.length; i++) {
            for (String point : finalPoint) {
                if (arcVariant[i].contains(point)) {
                    int length = hashStr.get(arcVariant[i]) + hashFinalArc.get(point);
                    tempArc[i] = length;
                hashTemp.put(length, arcVariant[i]);
                hashTemp2.put(arcVariant[i], point);

                }
            }
        }
        int minFind = minFind(tempArc);
        String arc = hashTemp.get(minFind);
        String point = hashTemp2.get(arc);
        System.out.println(point + " mem");
        System.out.println(arc + " mem");
        hashFinalArc.put(point, minFind);
        hashStr.remove(arc);
        finalPoint = finalPointM(finalPoint, point);

        dellArc(arcStr, arc);
    }

    private static int minFind(int[] pointLength) {
        return Arrays.stream(pointLength)
                .min()
                .getAsInt();
    }
    private static void dellArc(String[] arcStr, String arc) {
        for (int i = 0; i < arcStr.length; i++) {
            if (arcStr[i].equals(arc)) {
                arcStr[i] = null;
            }
        }
    }


    private static String[] finalPointM(String[] finalPoint, String point) {
            if (finalPoint[0].equals(point)) {
                return finalPoint;
            }else {
                String[] temp = new String[finalPoint.length + 1];
                System.arraycopy(finalPoint, 0, temp, 0, finalPoint.length);
                temp[temp.length - 1] = point;
                System.out.println((Arrays.toString(temp)) + " temp new finalPoint");
                return temp;
            }


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
        String[] arcStr1 = arcStringStart;
        String[] arcStr = arcStr1;



        String[] allPoint = allPoints();  // array of all points

        HashMap<String, Integer> hashFinalArc = new HashMap<>();    //map for real points
        String[] finalPoint = new String[1];

        String[] arcVariant = arcForChose(hashFinalArc, allPoint, arcStr, finalPoint);
        System.out.println((Arrays.toString(arcVariant)) + "  arcForChose  arcVariant для получения ребра");

        chooseArc(arcVariant, finalPoint, algorithm.hashStr, hashFinalArc, arcStr);
        arcStr = nullDel(arcStr);
        System.out.println("-----------------1-------------------");





        System.out.println(((algorithm.hashStr.size())) + "   size hashSTR");
        System.out.println((algorithm.hashStr.keySet()) + "  keys");
        System.out.println((Arrays.toString(finalPoint)) + "  finalPoints");
        System.out.println((Arrays.toString(arcStr)) + "   arcs final");
    }
}
