package org.example.proxy;

public class StartCar {

    public static void main(String[] args) {
        Car car = new ProxyCar();
        car.drive();
    }
}
