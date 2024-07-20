package org.example.port;

//Clase CONTEXTO parecido a un Adapter (no es un adapter por no implementar una interfaz con reglas)
public class StrategyContext {

    private PayStrategy payStrategy;

    //Este constructor es unicamente para evitar nulls, es simplemente optativo
    public StrategyContext(PayStrategy payStrategy) {
        setPayStrategy(payStrategy);
    }

    //Esto sirve para cambiar la estrategia
    public void setPayStrategy(PayStrategy payStrategy){
        this.payStrategy = payStrategy;
    }


    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }

}
