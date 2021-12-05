package com.syntax.class21;

public class CreditCardTester {
    public static void main(String[] args){
        CreditCard creditcard= new CreditCard(100);
        creditcard.total();
        AX ax = new AX (200);
        ax.total();
        VISA visa = new VISA (300);
        visa.total();
    }
}
