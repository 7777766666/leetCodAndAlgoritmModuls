package org.example.john;

public class Cat {

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void mau(){
        System.out.println("Mau-mau");
    }
    public static void thisPublicStaticMethod(){
        System.out.println("This is thisPublicStaticMethod");
    }
    private static void thisPrivateStaticMethod(){
        System.out.println("This is thisPrivateStaticMethod");
    }
    public void thisPublicMethod(){
        System.out.println("thisPublicMethod");
    }
    private void thisPrivateMethod(){
        System.out.println("thisPrivateMethod");
    }




}
