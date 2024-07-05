package org.example;

public interface PayStrategy {
    //Esta es mi estrategia para pagar
    boolean pay(int paymentAmount);

    //Esta es mi estrategia para imprimir los detalles del pago
    void collectPaymentDetails();

    //N... estrategias
}
