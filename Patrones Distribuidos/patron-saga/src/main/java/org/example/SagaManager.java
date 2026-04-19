package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SagaManager {

    public static void main(String[] args) {
        //bandera para evaluar si todos los pasos han sido ejecutados correctamente
        boolean success = true;

        //definimos cuales son los pasos
        List<SagaStep> steps = Arrays.asList(
                new OrderStep(),
                new PaymentStep(),
                new InventoryStep()
        );

        //Lista que servira para poner los pasos exitosos y para las reversiones si hay error en un paso
        List<SagaStep> completedSteps = new ArrayList<>();


        System.out.println("--- Iniciando Saga de Compra ---");
        for (SagaStep step : steps) {
            //step.execute() ejecuta toda la logica de operacion y evaluamos su exito
            if (step.execute()) {
                //agregamos a la lista de tareas completadas
                completedSteps.add(step);

            } else {
                success = false;
                break;
            }
        }

        if (!success) {
            System.out.println("\n--- Fallo detectado. Iniciando Compensación ---");
            Collections.reverse(completedSteps);
            for (SagaStep step : completedSteps) {
                step.compensate();
            }
        } else {
            System.out.println("\n--- Saga completada con éxito ---");
        }

        System.out.println("\nEstado final de la DB: " + FakeDB.logs);
    }
}
