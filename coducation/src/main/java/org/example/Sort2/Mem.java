package org.example.Sort2;

public class Mem {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        Sum sum = new Sum(10, 20);
        System.out.println(sum.sum2(a, b));


//        Mem mem = new Mem();
//        System.out.println(mem.sum1(a, b));





    }

    private void sum(int q, int w){
        int t = q + w * 100;
    }

    private int sum1(int q, int w){
        return q + w * 100;
    }

}
