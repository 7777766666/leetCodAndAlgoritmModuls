package org.example.day2;

import java.util.Arrays;
import java.util.Objects;

public class FindPart {

    String a;
    String b;

    public FindPart(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean findPart(String s, String t) {

        int[] a = stringToArrInt(t);
        int[] b = stringToArrInt(s);

        System.out.println((Arrays.toString(a)) +  "  long Arr a ");
        System.out.println((Arrays.toString(b)) + "   long Arr b");


        if (s.length() == 0){
            return true;
        }
        if (s.length() == 1 && t.contains(s) && t.length() > 1) {
            return true;
        }

        boolean xxx = false;


        if (s.length() >= t.length()) {
            return false;
        }
        int[] start = lengthInside(a, b);

        if (start.length < b.length) {  //if length between first and last < b.length +1
            return false;
        }
        int[] first = first(start, b);  //only letters from first Sting contain second string
        int[] dellNull = dellNull(first);


        System.out.println((Arrays.toString(dellNull)) + "   dellNull");
        StringBuilder stringBuilder = new StringBuilder();
        int[] check = finalResult(b, dellNull);
        for (int i = 0; i < check.length; i++) {
            
        }

        for (int i = 0; i < check.length; i++) {
            stringBuilder.append(((char) check[i]));
        }
        String final777 = stringBuilder.toString();
        System.out.println(final777 + "   $$$$$$$$$$$$$$$$$$$$$$");





//        System.out.println((Arrays.toString(check)) + "    check");
//        int count = 0;
//        for (int i = 0; i < b.length; i++) {
//            if (b[i] == check[i]){
//                count++;
//                if (count == b.length - 1) {
//                    return true;
//                }
//            }
//        }

        System.out.println((Arrays.toString(dellNull)) + "   dellnull");



return false;
    }

    public int[] lengthInside(int[] a, int [] b) {  //все значения крайних элементов, можно изменить
        int[] startDell = new int [a.length];
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == b[0]) {
                startDell[i] = a[i];
                for (j = a.length - 1; j >= 0; j--) {
                    if (a[j] == b[b.length - 1]) {
                        startDell[j] = a[j];
                        break;
                    }
                }
                break;
            }
        }
        int [] start = new int [j - i + 1];
        System.arraycopy(a, i, start, 0, j - i + 1);
        System.out.println((Arrays.toString(start)) + "   lengthInside start");
        if (start.length < b.length && j+1 == a.length){
            System.out.println("ШЕФ ВСЕ ПРОПАЛО!!!!!!!!!!");
            return new int[1];
        }


        return start;
    }

    public int[] first(int[] start, int[] x) {
        int[] first = new int[start.length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (start[i] == x[j]) {
                    first[i] = start[i];
                }
            }
        }
        System.out.println(Arrays.toString(first) + "   first");
        return first;
    }

    public int[] dellNull(int[] dell) {
        return Arrays.stream(dell)
                .filter(Objects::nonNull)
                .toArray();
    }

    private int[] stringToArrInt(String x) {
        byte[] aaa = x.getBytes();
        int[] a = new int[aaa.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) aaa[i];
        }
        return a;

    }
    private int[] finalResult(int[] start, int[] check) {
        int[] afterCheck = new int[check.length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < check.length; j++) {
                if (check[j] == start[i] && check[j] != 0 ) {
                    afterCheck[i] = check[j];

                }
            }
        }
        return afterCheck;
    }


}

