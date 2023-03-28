package org.example.algday1;

public class ReverseString {

    public static void main(String[] args) {
        char[] x = {'H','a','n','n','n','h'};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(x);

    }

    public void reverseString(char[] s) {
        char temp;
        int left = 0;
        int pivot = ( s.length % 2 == 0) ? s.length / 2 : (s.length / 2) - 1;
        int right = s.length - 1;

        for (int i = 0; i <= pivot; i++) {
            temp = s[i];
            s[i] = s[right];
            s[right] = temp;
            right--;

        }
        System.out.println(s);



    }
}
