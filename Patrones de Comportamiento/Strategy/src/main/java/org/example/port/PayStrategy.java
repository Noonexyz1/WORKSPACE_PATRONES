package org.example.port;

// por lo general hay SOLO UN METODO, pero puede haber mas metodos segun la necesidad;
// de ser asi lo MAS COMUN: entonces puedo decir que un metodo puede ser llevado
// a nivel de Clase o Interfaz y de la misma forma, un conjunto de comportamiento llegarlo
// a una Clase o Interfaz con un nombre correspondiente a ese conjunto de comportamientos
public interface PayStrategy {

    //Esta es mi estrategia para pagar
    boolean pay(int paymentAmount);

    //Esta es mi estrategia para imprimir los detalles del pago
    void collectPaymentDetails();

    //N... estrategias
}
