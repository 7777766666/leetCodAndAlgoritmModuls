package org.example.second;

public class ReverseString {


    protected char[] reverseStripng(char[] s) {
        char[] x = new char[s.length];
        int left = 0;
        for (int i = s.length - 1; i >= 0; i--) {

            x[left++] = s[i];
        }
        for (int i = 0; i < x.length; i++) {
            s[i] = x[i];
        }
        return s;
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] x = {'o', 'l', 'l', 'e', 'h'};

        ReverseString reverseString = new ReverseString();
        System.out.println(s);
        System.out.println(reverseString.reverseStripng(s));

        String ttt = new String("ttt").intern();
        String zzz = new String("ttt").intern();
        System.out.println(ttt == zzz);


//int a = 10;
//Integer b = 10;
//long  c = 10;
//Long d = 10L;
//short f = 10;
//double h = 10;
//float o = 10f;
//
//
//System.out.println(a == b);
//System.out.println(a == c);
//System.out.println(a == d);
//System.out.println(a == f);
//System.out.println(a == h);
//System.out.println(a == o);


    }
}
