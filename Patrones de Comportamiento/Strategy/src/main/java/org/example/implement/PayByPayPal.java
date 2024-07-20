package org.example.implement;

import org.example.port.PayStrategy;

public class PayByPayPal implements PayStrategy {




    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Pagado con " + paymentAmount + " implementacion de PayByPayPal");
        return true;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Los detalles del pago implementacion de PayByPayPal");
    }
}
