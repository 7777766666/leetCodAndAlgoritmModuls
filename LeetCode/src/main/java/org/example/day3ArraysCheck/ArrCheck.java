package org.example.day3ArraysCheck;

public class ArrCheck {

    public int strStr(String haystack, String needle) {
        String[] test = haystack.split(needle); //если длина массива ноль, значит совпадение 100%

        if (equalsArr(test) == 0) { //100% same
            return 0;
        }
        if ( diff(haystack, test) == -1) {  // different, because have not changed after split
            return -1;
        }
        return test[0].length();
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
            return -1;
        }
        return 555;
    }
}
