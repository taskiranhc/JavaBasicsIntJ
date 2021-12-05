package com.syntax.class22;

final class Parent {
    final double gravity=9.8;

    final void printGravity(){
       // gravity=10.5; gives error because we used final when we declare gravity
        System.out.println(gravity);
    }
}
// class Child extends Parent{ we cannot inherit because parent class is final
    // void printGravity(){ is not allowed because behaviour is also final
}
public class FinalDemo {
}
