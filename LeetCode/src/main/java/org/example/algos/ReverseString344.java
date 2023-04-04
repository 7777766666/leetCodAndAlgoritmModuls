package org.example.algos;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class ReverseString344 {



    public static char[] reverseString2(char[] s) {

        char [] x = new char[s.length];
        int left = 0;
        int right = s.length -1;
        while (left != s.length) {
            x[left++] = s[right--];
        }
        for (int i = 0; i < x.length; i++) {
            s[i] = x[i];
        }
        return s;
    }

    public static void reverseString1(char[] s) {

        char [] x = new char[s.length];
        int left = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            x[left++] = s[i];
        }
        for (int i = 0; i < x.length; i++) {
            s[i] = x[i];
        }
    }

    public static void main(String[] args) {
        char[] arr = {'H', 'a', 'n', 'n', 'a', 'h'};
//        System.out.println(Arrays.toString(arr));
        reverseString(arr);
        reverseString2(arr);

//        char[] xxx = {'a','m','a','n','a','P',' ',':', "l","a","n","a","c"," "," ","a",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]
//        ["a","m","a","n","a","P"," ",":","l","a","n","a","c"," "," ","a",",","n","a","l","p"," ","a"," ",",","n","a","m"," ","A"]



    }

    public static void reverseString(char[] s) {

        int left = 0;
        char [] x = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            x[left++] = s[i];


        }
s = x;
        System.out.println(Arrays.toString(s));
    }





}
