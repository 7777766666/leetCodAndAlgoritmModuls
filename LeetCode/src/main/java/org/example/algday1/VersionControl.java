package org.example.algday1;

import java.util.HashMap;

public class VersionControl {

    public int firstBadVersion(int n) {


        int left = 1;
        int right = n;

        int pivot = (left + right) / 2;
        while (right - left != 1) {
            pivot = (left + right) / 2;

            if (isBadVersion(pivot) == true) {
                if (isBadVersion(pivot - 1) == false) {
                    return pivot;
                }else {
                    right = pivot - 2;
                }
            } else {
                left = pivot;
            }
        }
        if (pivot == left) {
            return (isBadVersion(pivot) == false) ? right : left;
        }

        return 777;

    }

    public boolean isBadVersion(int x) {
        return booleanHashMap.get(x);
    }


    final static HashMap<Integer, Boolean> booleanHashMap = new HashMap<>();

    {
        booleanHashMap.put(1, false);
        booleanHashMap.put(2, false);
        booleanHashMap.put(3, false);
        booleanHashMap.put(4, false);
        booleanHashMap.put(5, true);
        booleanHashMap.put(6, true);
        booleanHashMap.put(7, true);
        booleanHashMap.put(8, true);
        booleanHashMap.put(9, true);
        booleanHashMap.put(10, true);
        booleanHashMap.put(11, true);
        booleanHashMap.put(12, true);
        booleanHashMap.put(13, true);
        booleanHashMap.put(14, true);
        booleanHashMap.put(15, true);
//        for (int i = 16; i < 1000000; i++) {
//            booleanHashMap.put(i, true);
//
//        }
    }


    public static void main(String... args) {
        VersionControl versionControl = new VersionControl();

        int x = 5;
//        System.out.println(versionControl.isBadVersion(x));
        System.out.println(versionControl.firstBadVersion(x));


    }
}
