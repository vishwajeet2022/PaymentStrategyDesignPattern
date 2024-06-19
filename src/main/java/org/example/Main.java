package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        shoppingCartStrategy shoppingCartStrategy=new shoppingCartStrategy();

        Item Apple=new Item("Apple",10);
        Item Iphone14=new Item("Iphone14",65000);
        Item AC=new Item("AC",68000);

        shoppingCartStrategy.addItem(Apple);
        shoppingCartStrategy.addItem(Iphone14);
        shoppingCartStrategy.addItem(AC);

        paymentStrategy paymentStrategy=new creditCardPaymentStrategy("12345678900","Vishwajeet","15111099","123");
        shoppingCartStrategy.setPaymentStrategy(paymentStrategy);
        shoppingCartStrategy.checkout();
    }
}