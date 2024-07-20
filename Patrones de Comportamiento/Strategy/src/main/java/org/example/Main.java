package org.example;

import org.example.implement.PayByCreditCard;
import org.example.implement.PayByPayPal;
import org.example.port.PayStrategy;
import org.example.port.StrategyContext;

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