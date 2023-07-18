package org.example.observerPractica1;

public class BankExpensePrac implements Observer {
    private double balance;

    public BankExpensePrac(){
    }




    public void display() {
        System.out.println("El Balance es: " + balance);
    }




    @Override
    public void actualizar(double balance) {
        this.balance = balance;
        display();
    }


}
