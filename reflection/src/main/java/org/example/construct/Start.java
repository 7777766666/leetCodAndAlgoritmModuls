package org.example.construct;

public class Start {

    public static void main(String[] args) {

        AAA aaa = new AAA(55);
        AAA.mem();


        BBB bbb = new BBB(10, 20);
//        bbb.mem();
//        BBB.mem();

        CCC ccc = new CCC(111, 222, "CCC!!!");
        ccc.mem();
//        CCC.mem(bbb);






    }
}
