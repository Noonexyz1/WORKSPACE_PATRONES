package org.example;

import java.util.Iterator;

class MessageRelay {

    public void publishEventsToBroker() {
        Iterator<OutboxEvent> iterator = MockDatabase.OUTBOX_TABLE.iterator();

        while (iterator.hasNext()) {
            OutboxEvent event = iterator.next();
            try {
                // Simulación de envío al Broker
                System.out.println("[Broker] Enviando evento: " + event.payload());

                // Si el envío es exitoso, lo eliminamos de la Outbox
                iterator.remove();
                System.out.println("[DB] Evento procesado y eliminado de Outbox.");
            } catch (Exception e) {
                System.err.println("Fallo el envío, se reintentará en el próximo ciclo.");
            }
        }
    }

}
