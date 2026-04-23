package org.example;

public class SagaLoggerDecorator implements SagaStep {

    private final SagaStep step;
    private final String stepName;

    public SagaLoggerDecorator(SagaStep step, String stepName) {
        this.step = step;
        this.stepName = stepName;
    }

    @Override
    public boolean execute() {
        System.out.println("[SAGA-LOG] Intentando ejecutar paso: " + stepName);

        //Logica de negocio
        boolean success = step.execute();

        if (success) {
            System.out.println("[SAGA-LOG] Paso '" + stepName + "' completado con éxito.");
            FakeDB.logs.add(stepName);
            return true;
        } else {
            System.out.println("[SAGA-LOG] Paso '" + stepName + "' falló. Se requiere compensación del paso anterior.");
            return false;
        }
    }

    @Override
    public void compensate() {
        System.out.println("[SAGA-LOG] Iniciando compensación de: " + stepName);
        step.compensate();
        FakeDB.logs.remove(stepName);
        System.out.println("[SAGA-LOG] Compensación de '" + stepName + "' finalizada.");
    }
}
