package org.example.Sort2;

public class OneTwo {

    public static void main(String[] args) {

//        int[] lol = {0, 1, 0, 1, 1, 0,  1, 1, 1, 1, 1, 0, 9, 8};
        int[] lol = {0, 9, 13, 0,0, 13, 0, 4, 55, 0, 1,1,1,1,1,1,1, 0, 11,9, 0, 88};
        System.out.println((find(lol)) + "  maxCount");
    }

    private static int find(int[] x) {
        if (x.length < 3)
            return (x.length == 0) ? 0 : (x.length == 1 ? 1 : (x[0] == 0 && x[1] == 0 ? 1 : 2));
        int maxCount = 0;
        int count1 = 0;
        int count2 = 0;
        int r = 0;
        int l = 0;
        while (r < x.length) {
            while (r < x.length && x[r] == 0) {
                r++;
            }
            l = r;
            while (r < x.length && x[r] != 0) {
                r++;
            }
            count1 = (r - l < x.length) ? r - l + 1 : r - l;
            if (r + 1 < x.length && x[r + 1] != 0) {
                count1 = count1 - 1;
                r++;
                while (r < x.length && x[r] != 0) {
                    r++;
                }
                count2 = r - l;
                l = r - count1;
            }
            count2 = (count2 < count1) ? count1 : count2;
            maxCount = (maxCount < count2) ? count2 : maxCount;
        }
        return maxCount;
    }
}
