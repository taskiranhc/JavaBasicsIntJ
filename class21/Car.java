package com.syntax.class21;

public class Car {

    void start(){
        System.out.println("Use keys to run me");
    }
    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Use button to run me");
    }
}
class Tesla extends Car {
    void start() {
        System.out.println("Use mobile app to run me");
    }

    void stop() {
        System.out.println("Use sensors to run me");
    }
}
class Toyota extends Car{

}

