package org.example.Vk;

public class RefactorTest {

    public void someMethod() {
        RefactorTest.refactor1();
        RefCreator.printOperativeRef();
        RefactorTest.refactor2();

    }

    public void someElseMethod() {
        RefactorTest.refactor1();
        RefCreator.printHistoricalRef();
        RefactorTest.refactor2();
    }

    static class RefCreator {
        static void printOperativeRef() {
            System.out.println("operative ref");
        }

        static void printHistoricalRef() {
            System.out.println("historical ref");
        }
    }

    static void refactor1() {
        System.out.println("do Some usual");
        System.out.println("do Some usual1");
    }

    static void refactor2() {
        System.out.println("do Some usual2");
        System.out.println("do Some usual3");
    }


    public static void main(String[] args) {
        RefactorTest refactorTest = new RefactorTest();
        refactorTest.someMethod();
        refactorTest.someElseMethod();
    }

}
