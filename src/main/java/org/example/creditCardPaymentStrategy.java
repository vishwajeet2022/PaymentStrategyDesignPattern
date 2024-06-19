package org.example;

public class creditCardPaymentStrategy implements paymentStrategy{
    private final String cardNumber;
    private final String cardHolderName;
    private final String expiry;
    private final String CVV;

    creditCardPaymentStrategy(String cardNumber, String cardHolderName, String expiry, String CVV){
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.expiry=expiry;
        this.CVV=CVV;
    }
    @Override
    public void pay(int amount) {
     System.out.println("Paid "+amount+" using CreditCard");
    }
}
