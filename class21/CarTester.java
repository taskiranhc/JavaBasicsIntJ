package com.syntax.class21;

public class CarTester {
    public static void main(String[] args){
        Car car=new BMW();
        car.start();
        car.stop();
        car.park();

        Car[] cars={new BMW(), new Tesla(), new Toyota()};
        for (Car car1:cars){
            car1.start();
            car1.stop();
            car1.park();
        }
    }
}
