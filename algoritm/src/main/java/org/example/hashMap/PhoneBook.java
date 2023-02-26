package org.example.hashMap;

import java.util.HashMap;

public class PhoneBook {

    HashMap <Integer, String> hashMap = new HashMap<>();

    public PhoneBook(){
        hashMap.put(1234, "Bob");
        hashMap.put(987374656, "Tom");
        hashMap.put(222, "Lol");
    }

    public String convertToStringName(int x){
//        x = (Integer) x;
        PhoneBook phoneBook = new PhoneBook();
        return phoneBook.hashMap.get(x);
    }
}
