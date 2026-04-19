package org.example;

import java.util.ArrayList;
import java.util.List;

// Simulación de Base de Datos
class MockDatabase {

    public static List<String> USERS = new ArrayList<>();
    public static List<OutboxEvent> OUTBOX_TABLE = new ArrayList<>();

    // Simulamos una transacción atómica
    public static void saveUserWithEvent(String username, OutboxEvent event) {
        USERS.add(username);
        OUTBOX_TABLE.add(event);
        System.out.println("[DB] Usuario y Evento guardados atómicamente.");
    }

}
