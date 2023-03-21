package org.example.day6;

public class Smeh {


    public static void main(String[] args) {


        int[] mem = { 2, 6, 7, 6, -81};
        Smeh smeh = new Smeh();
        System.out.println(smeh.sum(mem, 0));
    }

    public int sum(int[] arr, int x) {

        if (x == arr.length) {
            return 0;
        }
        while (x < arr.length){
            int zzz = arr[x] + sum(arr, x+1);
            return zzz;


        }
        return x;
    }
}
