package org.example;

class OrderStep implements SagaStep {
    @Override
    public boolean execute() {
        FakeDB.logs.add("ORDEN_CREADA");
        System.out.println("-> Orden creada con éxito.");
        return true;
    }

    @Override
    public void compensate() {
        FakeDB.logs.remove("ORDEN_CREADA");
        System.out.println("<- Compensación: Orden eliminada.");
    }
}
