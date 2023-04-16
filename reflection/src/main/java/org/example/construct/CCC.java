package org.example.construct;

public class CCC extends BBB {

    String c;

    public CCC(int x, int f, String c) {
        super(x, f);
        this.c = c;

    }

    public static void mem(){
        System.out.println("CCCCCCC");
    }

    public void lol(){
        System.out.println("  LOL  from CCC");
    }
}
