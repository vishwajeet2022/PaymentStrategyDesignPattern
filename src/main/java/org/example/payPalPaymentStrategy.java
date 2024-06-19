package org.example;

public class payPalPaymentStrategy implements paymentStrategy{
    private final String paypalId;
    private final String password;

    payPalPaymentStrategy(String paypalId, String password){
        this.paypalId=paypalId;
        this.password=password;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using payPal");
    }
}
