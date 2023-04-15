package org.example.singleton;

public class Singleton {

    private static Singleton instance;
    private int size;
    private String str;

    private Singleton() {


    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void setSize(int x){
        this.size = x;
    }
    public int getSize(){
        return size;
    }

    public void setStr(String s){
        this.str = s;
    }
    public String getStr(){
        return str;
    }


}
