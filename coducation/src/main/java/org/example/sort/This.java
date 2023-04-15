package org.example.sort;

import java.util.ArrayList;
import java.util.List;

public class This {

    static String qqqqqqqqqqq = "mem";

    static {
     String z = "" + qqqqqqqqqqq;
    }



    public static void main(String[] args) {
        String s = "lol";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("lol");
        StringBuilder stringBuilder1 = new StringBuilder("lol");

        System.out.println(stringBuilder1.equals(stringBuilder));
//        System.out.println(s.equals(stringBuilder1));
//
//        Integer x = 100;
//        System.out.println(x.equals(stringBuilder));



//    This t = new This();
//        t.mem();
//        System.out.println(t.toString());
//
//        This z = new This();
//        System.out.println(z.toString());
//
//        List y = new ArrayList<Long>();
//        y.add(1L);
//        y.add(1,0);
//        y.add(new Object());
//        y.add("1L");
//
//        System.out.println(y.size());


    }

    private void mem(){
        System.out.println(this.getClass());
        System.out.println(this.toString());

    }



}
