package org.example;

import java.util.ArrayList;
import java.util.List;

public class shoppingCartStrategy {
    List<Item> items;
    paymentStrategy paymentStrategy;

    shoppingCartStrategy(){
        items=new ArrayList<>();
    }
    public void setPaymentStrategy(paymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void checkout(){
        int totalBill=items.stream().mapToInt(Item::getPrice).sum();

        /*for(int i=0; i<items.size(); i++){
        totalBill+ = items.get(i).getPrice();
        * */
        paymentStrategy.pay(totalBill);
    }
}
