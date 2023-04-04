package org.example.fabrica;

public class Main {

    public static void main(String[] args) {


        Cat puma = new CatFactory().createCat(55);
        Cat tiger = new CatFactory().createCat(555);
        System.out.println(puma.getClass());
//        System.out.println(catTigerOrPuma);
        System.out.println(tiger.getClass());
    }


}
