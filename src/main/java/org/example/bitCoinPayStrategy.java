package org.example;

public class bitCoinPayStrategy implements paymentStrategy{
    private final String walletAddress;

    bitCoinPayStrategy(String walletAddress){
        this.walletAddress=walletAddress;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using bitCoinPay");
    }
}
