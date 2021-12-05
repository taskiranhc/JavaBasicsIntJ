package com.syntax.class21;

public class CreditCard {
    /*
    Create a class named CreditCard and define variable balance and interest
    Create an instance method that will calculate interest based on the given balance
    Create 2 subclasses: VISA and AX. In AX class override method calculate interest.
    Call the method by creating an object of each classes.
     */
    double balance;
    double interest;
    CreditCard(double balance){
    this.balance=balance;
}
    void total(){
        interest=balance*0.25;
        System.out.println(interest);
        System.out.println(balance);
    }
}
class AX extends CreditCard {

    AX(double balance) {
        super(balance);
    }
    @Override
    void total() {
        interest=balance*0.15;
        System.out.println(interest);
    }
}
class VISA extends CreditCard{

    VISA(double balance) {
        super(balance);
    }
    }