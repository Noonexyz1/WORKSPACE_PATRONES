package org.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("--- INICIO DE LA SIMULACIÓN ---");

        // 1. El usuario realiza acciones (esto llena la Outbox)
        System.out.println("\n[Acción] Creando usuarios...");

        UserService userService = new UserService();
        userService.createUser("Alice");
        userService.createUser("Bob");

        // Verificamos el estado de la "DB" antes de que el Relay actúe
        System.out.println("\n[Estado DB] Usuarios guardados: " + MockDatabase.USERS);
        System.out.println("[Estado DB] Eventos pendientes en Outbox: " + MockDatabase.OUTBOX_TABLE.size());


        System.out.println("\n--- INICIANDO PROCESO RELAY (Simulado) ---");

        // 2. Simulamos el paso del tiempo o un Job programado
        // En la industria, esto corre en un loop infinito o cada N segundos
        MessageRelay relay = new MessageRelay();
        relay.publishEventsToBroker();

        // 3. Verificamos el estado final
        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("[Estado DB] Eventos en Outbox tras el Relay: " + MockDatabase.OUTBOX_TABLE.size());

        if (MockDatabase.OUTBOX_TABLE.isEmpty()) {
            System.out.println("SUCCESS: Todos los eventos fueron enviados al broker y limpiados.");
        }
    }

}
