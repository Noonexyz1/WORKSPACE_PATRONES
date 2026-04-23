package org.example;

class InventoryStep implements SagaStep {
    @Override
    public boolean execute() {
        // Simulamos un error: no hay stock
        System.out.println("-> Error: No hay stock disponible.");
        return false;
    }

    @Override
    public void compensate() {
        // No hace nada si no llegó a ejecutarse, o limpia si es necesario
        //System.out.println("<- Compensación: No hay stock disponible.");
    }
}
