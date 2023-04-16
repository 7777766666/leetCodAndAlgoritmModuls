package org.example.re;

public class B extends A{
    private final String b;

    public B(int a, String b){
        super(a);
        this.b = b;
    }

    public String getB() {
        return b;
    }
    public int getA(){
        return super.getA();

    }
}
