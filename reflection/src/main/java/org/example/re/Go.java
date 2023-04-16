package org.example.re;

public class Go {

    public static void main(String[] args) {

        C c = new C();

        B ttt = c.change2(200, "ttt");
        System.out.println(ttt.getA() + " " + ttt.getB());

        B second = new B(2, "  second");
        System.out.println(second.getA() + second.getB());

        C ccc = new C();
        second = ccc.change(second);
        System.out.println(second.getA() + "  " + second.getB());

    }
}
