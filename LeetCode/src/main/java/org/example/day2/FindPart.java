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

        String[] a = s.split("");
        String[] b = t.split("");


        boolean xxx = false;

        if (s.length() <= t.length()) {
            return false;
        }
        String[] start = lengthInside(a, b);

        if (start.length <= b.length) {  //if length beetwin first and last < b.length +1
            return false;
        }
        String[] first = first(start, b);  //only letters from first Sting contain second string
        String[] dellNull = dellNull(first);
        System.out.println((Arrays.toString(dellNull)) + "   dellNull");


        String toStringArr = toStringArr(dellNull);
        System.out.println(toStringArr);
        if (t.contains(toStringArr)){
            System.out.println("##########################################");
            xxx = true;
            return xxx;
        }



        return xxx;
    }

    public String[] lengthInside(String[] a, String[] b) {  //все значения крайних элементов, можно изменить
        String[] startDell = new String[a.length];
        int i = 0, j = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i].equals(b[0])) {
                startDell[i] = a[i];
                for (j = a.length - 1; j >= 0; j--) {
                    if (a[j].equals(b[b.length - 1])) {
                        startDell[j] = a[j];
                        break;
                    }
                }
                break;
            }
        }
        String[] start = new String[j - i + 1];
        System.arraycopy(a, i, start, 0, j - i + 1);
        System.out.println((Arrays.toString(start)) + "   lengthInside start");
        return start;
    }

    public String[] first(String[] start, String[] x) {
        String[] first = new String[start.length];
        for (int i = 0; i < start.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (start[i].equals(x[j])) {
                    first[i] = start[i];
                }
            }
        }
        System.out.println(Arrays.toString(first) + "   first");
        return first;
    }

    public String[] dellNull(String[] dell) {
        return Arrays.stream(dell)
                .filter(Objects::nonNull)
                .toArray(String[]:: new);
    }
    public String toStringArr(String[] x) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            stringBuilder.append(x[i]);
        }
        return stringBuilder.toString();
    }




}

