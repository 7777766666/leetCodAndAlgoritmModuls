package org.example.fabrica;

public class CatFactory {


    public Cat createCat(int mass) {
        if (mass > 100) {
            return new Tiger();
        }else {
            return new Puma();
        }
    }
}
