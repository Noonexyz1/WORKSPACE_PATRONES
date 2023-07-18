package org.example;

import io.reactivex.rxjava3.core.*;
import org.example.observer.ClaseObservable;
import org.example.observer.ClaseObservadorNr1;
import org.example.observer.ClaseObservadorNr2;
import org.example.observer.ClaseObservadorNr3;

import org.example.observerEjemploPro.BankAccount;
import org.example.observerEjemploPro.BankExpense;
import org.example.observerEjemploPro.BankExpenseImpl;

import org.example.observerPractica1.BankAccountPrac;
import org.example.observerPractica1.BankExpensePrac;
import org.example.observerPractica1.Observer;
import org.example.observerRxJava.BanckAccount;

public class Main {
    public static void main(String[] args) {
        //Creamos un observable
        ClaseObservable observable = new ClaseObservable();

        //Añadimos los observadores que queramos
        observable.addObservador(new ClaseObservadorNr2());
        observable.addObservador(new ClaseObservadorNr1());
        observable.addObservador(new ClaseObservadorNr3());

        observable.notificarALosObservadores();
        System.out.println();
        observable.algunaLogica();


        //Ejemplo del Banco
        Observer expense1 = new BankExpensePrac();
        Observer expense2 = new BankExpensePrac();
        Observer expense3 = new BankExpensePrac();

        BankAccountPrac account = new BankAccountPrac();
        account.addObserver(expense1);
        account.addObserver(expense2);
        account.addObserver(expense3);

        account.deposit(100);
        account.withdraw(50);


        //Ejemplo Pro
        BankAccount accountPro = new BankAccount();
        //BankExpense es un interfaz
        BankExpense expense = new BankExpenseImpl();

        accountPro.addObserver(expense);

        accountPro.deposit(100);
        accountPro.withdraw(50);

        accountPro.deposit(200);



        //Ejemplo con RxJava
        String mensaje = "Hola, Aprendiendo Observer";
        BanckAccount b = new BanckAccount(mensaje);
        b.subscribe(mensajeRecicido -> {
            System.out.println(mensajeRecicido);
        });

        b.enviarMensaje();

        System.out.println("Este mensaje se ejecuta al mismo tiempo que se lanzo la operacion anterio del codigo");



    }
}