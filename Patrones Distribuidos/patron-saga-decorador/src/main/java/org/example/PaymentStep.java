package org.example;

class PaymentStep implements SagaStep {
    @Override
    public boolean execute() {
        // Simulamos una lógica de negocio
        //FakeDB.logs.add("PAGO_REALIZADO");
        System.out.println("-> Pago procesado.");
        return true;
    }

    @Override
    public void compensate() {
        //FakeDB.logs.remove("PAGO_REALIZADO");
        System.out.println("<- Compensación: Reembolso emitido.");
    }
}
