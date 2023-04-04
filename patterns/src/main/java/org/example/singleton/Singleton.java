package org.example.singlton;

public class Singelton {

    private Singelton instance;

    public Singelton(){
        if (instance == null) {
            instance = new Singelton();
        }
    }
}
