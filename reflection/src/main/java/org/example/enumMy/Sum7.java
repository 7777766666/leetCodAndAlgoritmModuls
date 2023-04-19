package org.example.enumMy;

 class Sum7 {

    private static int sum(int... x){
        int sum = 0;
        for (int xxx : x){
            sum += xxx;
        }
        return sum;
    }
}
