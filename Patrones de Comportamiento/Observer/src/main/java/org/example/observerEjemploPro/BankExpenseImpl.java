package org.example.observerEjemploPro;

public class BankExpenseImpl implements BankExpense {
    private double balance;




    public void display() {
        System.out.println("Balance: " + balance);
    }




    @Override
    public void update(double balance) {
        this.balance = balance;
        display();
    }


}
