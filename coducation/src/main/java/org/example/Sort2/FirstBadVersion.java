package org.example.Sort2;

import java.util.ArrayList;
import java.util.List;

public class FirstBadVersion {

    public static void main(String[] args) {


        FirstBadVersion firstBadVersion = new FirstBadVersion();
//        System.out.println(firstBadVersion.isBadVersion(version, 1 ));
//        System.out.println(firstBadVersion.isBadVersion(version, 2));
//        System.out.println(firstBadVersion.isBadVersion(version, 3));
//        System.out.println(firstBadVersion.isBadVersion(version, 4));
//        System.out.println(firstBadVersion.isBadVersion(version, 5));

        System.out.println(firstBadVersion.firstBadVersion(5) + "  first bad version");

    }

    public boolean isBadVersion(int x) {
        x = x - 1;
        List<Boolean> version = new ArrayList<>();
        version.add(false);
        version.add(false);
        version.add(false);
        version.add(true);
        version.add(true);
//        version.add(true);
        return version.get(x);
    }

    public int firstBadVersion(int n) {

        int l = 1;
        int r = n;

        while (true) {

            int index = l + (r - l) / 2;
            if (isBadVersion(index)) {
                r = index;
            } else {
                l = index + 1;
            }

            if (r - l <= 1)
                return (!isBadVersion(r - 1)) ? r : l;
        }
    }


    public int firstBadVersion1(int n) {

        if (n == 1) return 1;
        if (n == 2) return (isBadVersion(1)) ? 1 : 2;

        if (isBadVersion(1)) return 1;


        int l = 1;
        int r = n;
//        int index = 0;

        while (l <= r) {

            int index = l + (r - l) / 2;
            if (isBadVersion(index) == true && isBadVersion(index - 1) == false) {
                return index;
            } else if (isBadVersion(index) == false) {
                l = index + 1;
            } else {
                r = index - 1;
            }

        }


        return -1;

    }
}
