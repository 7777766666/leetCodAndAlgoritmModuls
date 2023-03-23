package org.example.algday1;

import java.util.HashMap;

public class VersionControl {

    public int firstBadVersion(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            if (isBadVersion(1) == false) {
                return 2;
            } else {
                return 1;
            }
        }
        if (n == 3) {
            if (isBadVersion(n - 1) == false){
                return 3;
            }else {
                return (isBadVersion(1) == true) ? 1 : 2;
            }
        }


        int left = 1;
        int right = n;

        int pivot = (left + right) / 2;
        while (right - pivot != 1 && pivot - left != 1) {

            if (isBadVersion(pivot) == true) {
                right = pivot;
                pivot = (right + left) / 2;

            } else {
                left = pivot;
                pivot =( ((right + 1) + left) / 2);
            }

        }

        if ( pivot - left == 1) {
            if (isBadVersion(pivot) == true){
                return (isBadVersion(pivot - 1) == true) ? left : pivot;
            } else {
                if (right == n) {
                    return (isBadVersion(pivot + 1) == false) ? right : right - 1;
                } else
                return (isBadVersion(pivot + 1) == false) ? right : pivot + 1;
            }
        } else {
            if (isBadVersion(pivot) == false) {
                return right;
            }else {
                return (isBadVersion(pivot - 1) == true) ? pivot - 1 : pivot;
            }
        }
    }

    public boolean isBadVersion(int x) {
        return booleanHashMap.get(x);
    }


    final static HashMap<Integer, Boolean> booleanHashMap = new HashMap<>();

    {
        booleanHashMap.put(1, false);
        booleanHashMap.put(2, false);
        booleanHashMap.put(3, true);
        booleanHashMap.put(4, true);
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
        for (int i = 16; i < 1000000; i++) {
            booleanHashMap.put(i, true);

        }
    }


    public static void main(String... args) {
        VersionControl versionControl = new VersionControl();

        int x = 15;
//        System.out.println(versionControl.isBadVersion(x));
        System.out.println(versionControl.firstBadVersion(x));


    }
}
