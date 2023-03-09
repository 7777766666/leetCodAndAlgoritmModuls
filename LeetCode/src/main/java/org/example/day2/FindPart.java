package org.example.day2;

import java.util.Arrays;

public class FindPart {

    String a;
    String b;

    public FindPart(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean findPart(String s, String t) {

        byte[] a = t.getBytes();
        byte[] b = s.getBytes();

        if (s.length() == 0) {
            return true;
        }
        if (s.length() == 1 && t.contains(s) && t.length() > 1) {
            return true;
        }

        byte[] start = start(a, b);
        System.out.println(Arrays.toString(b));
        System.out.println((Arrays.toString(start)) + "  start");

        for (int i = 0; i < start.length; i++) {
            if (start[i] == b[i]) {
                if (i == start.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private byte[] start(byte[] longArr, byte[] shortArr) {
        byte[] start = new byte[shortArr.length];
        int w = 0;
        int z = 0;
        for (byte value : longArr) {
            if (value == shortArr[w]) {
                w++;
                start[z] = value;
                z++;
                if (z == shortArr.length) {
                    return start;
                }
            }
        }
        return new byte[0];
    }
}

