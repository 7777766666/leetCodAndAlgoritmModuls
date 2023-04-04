package org.example.jenerics;

import java.util.ArrayList;

public class Jenerics {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add("Pasha");
        arrayList.add(new Integer(1));


        System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        double x = 0.005;
        double y = 0.004;
        System.out.println(String.format("%.2f", x));
        System.out.println(String.format("%.2f", y));


    }
}
