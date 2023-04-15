package org.example.Sort2;

public class Sum {
    private int x;
    private int y;

    public Sum(int x, int y) {
        this.x = x;
        this.y = y;
    }
    private int sum(int a, int b){
        return a + b + this.x + this.y;
    }
    public int sum2(int a, int b){
        return sum(a, b);

    }
}
