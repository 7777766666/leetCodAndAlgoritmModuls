package string;


import java.util.HashMap;
import java.util.Map;

public class ZeroOne {

    public static void main(String[] args) {

        int[] z = {1,1, 0, 0, 1, 1, 1,1, 0 , 1};
        System.out.println(ZeroOne.find(z));

    }

    private static int find(int[] x){

        int l = 0;
        int r = 0;
        int count = 0;
        int zero = 0;
        while (r != x.length) {
            if (x[r] == 1) {
                count++;
                r++;
            } else if (x[r] == 0 && zero == 0) {
                count++;
                r++;
                zero++;
            } else {
                while (x[l] != 0) {

                    l++;
                    count--;
                }
                zero--;
            }
        }
return count;

    }

}
