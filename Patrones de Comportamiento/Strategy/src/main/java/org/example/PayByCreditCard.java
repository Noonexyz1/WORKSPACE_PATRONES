package org.example;

public class PayByCreditCard implements PayStrategy {




    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Pagado con " + paymentAmount + " implementacion de PayByCreditCard");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Los detalles del pago implementacion de PayByCreditCard");
    }
}
