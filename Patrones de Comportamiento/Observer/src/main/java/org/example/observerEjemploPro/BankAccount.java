package org.example.observerEjemploPro;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;



    private List<BankExpense> observers = new ArrayList<>();




    public void deposit(double amount) {
        balance += amount;
        notifyObservers();
    }
    public void withdraw(double amount) {
        balance -= amount;
        notifyObservers();
    }




    public void addObserver(BankExpense observer) {
        observers.add(observer);
    }
    public void removeObserver(BankExpense observer) {
        observers.remove(observer);
    }
    private void notifyObservers() {
        for (BankExpense observer : observers) {
            observer.update(balance);
        }
    }


}
