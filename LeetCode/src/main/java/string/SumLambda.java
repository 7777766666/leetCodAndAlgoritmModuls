package string;

public class SumLambda implements Lambda{

    int a;
    int b;

    public SumLambda(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus(int a, int b) {
        return a + b;
    }
}
