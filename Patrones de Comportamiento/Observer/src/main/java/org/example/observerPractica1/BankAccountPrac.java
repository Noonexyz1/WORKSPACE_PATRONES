package org.example.observerPractica1;

import java.util.ArrayList;
import java.util.List;

public class BankAccountPrac implements Observable{

    private double balance;
    //Lista de objetos que me estan observando
    private List<Observer> gastosBancarios = new ArrayList<>();




    public BankAccountPrac(){
    }





    public void metodhFromAnyLogic(){
        //This is to shot deleteObserver() when this metodh was actived
        notifyToObservers();
    }
    public void deposit(double amount) {
        balance += amount;
        notifyToObservers();
    }

    public void withdraw(double amount) {
        balance -= amount;
        notifyToObservers();
    }





    @Override
    public void addObserver(Observer gastosBancarios) {
        this.gastosBancarios.add(gastosBancarios);
    }

    @Override
    public void deleteObserver(Observer gastosBancarios) {
        this.gastosBancarios.remove(gastosBancarios);
    }

    @Override
    public void notifyToObservers() {
        this.gastosBancarios.stream().forEach(gastBank -> {
            gastBank.actualizar(this.balance);
            System.out.println("Notificar a todos los observadores");});
    }

}
