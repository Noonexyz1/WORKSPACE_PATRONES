package org.example.observerRxJava;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class BanckAccount extends Observable<String> {

    private String mensaje;
    //Lista de objetos que me estan observando
    private List<Observer<? super String>> gastosBancarios = new ArrayList<>();




    public BanckAccount(String mensaje){
        this.mensaje = mensaje;
    }






    public void enviarMensaje(){
        Timer timerMensaje = new Timer();
        timerMensaje.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                gastosBancarios.forEach(o -> o.onNext(mensaje));
                gastosBancarios.forEach(o -> o.onComplete());
                timerMensaje.cancel();
            }
        }, 4000, 1);
    }



    @Override
    protected void subscribeActual(Observer<? super String> observer) {
        this.gastosBancarios.add(observer);
    }

}
