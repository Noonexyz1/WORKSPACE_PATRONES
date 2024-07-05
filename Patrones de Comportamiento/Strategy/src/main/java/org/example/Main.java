package org.example;

public class Main {
    public static void main(String[] args) {
        //Codigo Cliente
        PayStrategy payStrategyByPayPal = new PayByPayPal();

        StrategyContext context = new StrategyContext(payStrategyByPayPal);
        context.pay(500_000);
        context.collectPaymentDetails();

        payStrategyByPayPal = new PayByCreditCard();
        context.setPayStrategy(payStrategyByPayPal);
        context.pay(1_000_000);
        context.collectPaymentDetails();

    }
}