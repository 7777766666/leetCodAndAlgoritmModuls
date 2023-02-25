package org.example.hashMap;

import java.util.HashMap;

public class RomeToArabic {
    HashMap<String, Integer> converter = new HashMap<>();

    public RomeToArabic(){

        converter.put("I", 1);
        converter.put("II", 2);
        converter.put("III", 3);
        converter.put("IV", 4);
        converter.put("V", 5);
        converter.put("VI", 6);
        converter.put("VII", 7);
        converter.put("VIII", 8);
        converter.put("IX", 9);
        converter.put("X", 10);
        converter.put("XX", 20);
        converter.put("XXX", 30);
        converter.put("XL", 40);
        converter.put("L", 50);
        converter.put("LX", 60);
        converter.put("LXX", 70);
        converter.put("LXXX", 80);
        converter.put("XC", 90);
        converter.put("C", 100);
        converter.put("D", 500);
        converter.put("M", 1000);

    }


    public int superConverter(String str) {



        RomeToArabic romeToArabic = new RomeToArabic();
        return romeToArabic.converter.get(str);

    }
}
