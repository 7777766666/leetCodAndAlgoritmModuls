package org.example;

/**
 * Hello world!
 *
 */
public class App {
    String a;

    public App(String a) {
        this.a = a;
    }
    public static void main( String[] args ) {
        App app1 = new App("bnpwqnpoiqen");
        App app2 = new App("][eskgwe");
        app1 = app2;
//        System.gc();
        Runtime.getRuntime().gc();

    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("бла бла бла Finalize Garbage Collector");
    }

}
