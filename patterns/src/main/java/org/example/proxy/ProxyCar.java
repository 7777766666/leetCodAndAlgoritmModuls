package org.example.proxy;

public class ProxyCar implements Car {

    Car car1 = new BMW();
    Car car = new Audi();
    Porsh car2 = new Porsh();
    @Override
    public void drive(){
        System.out.println("It is from proxy");
        car.drive();
        car2.drive();
        car1.drive();
        car2.mem();


    }

}
