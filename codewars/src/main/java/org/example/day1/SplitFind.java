package org.example.day1;

public class SplitFind {

    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length()) {
            return -1;
        }
        String[] test = haystack.split(needle); //если длина массива ноль, значит совпадение 100%
        if (equalsArr(test) == 0) {
            return 0;
        }
        if ( diff(haystack, test) == -1) {  // different, because have not changed after split
            return -1;
        }
        return test[0].length();
    }
    public int[] startPoint(byte[] big, byte[] small) {
        int [] temp = new int[big.length];
        for (int i = 0; i < big.length; i++) {
            if (small[0] == big[i]) {
                temp[i] = i;
            }
        }
        return temp;
    }

    public int equalsArr(String[] test) {  //если длина массива ноль, значит совпадение 100%
        if (test.length == 0) {
            return 0;
        }
        return 666;
    }

    public int diff(String y, String[] x) {
        String[] inOne = {y};

        if (x[0].equals(inOne[0])) {

            System.out.println(" dont split");
            return -1;
        }
        return 555;
    }

}
