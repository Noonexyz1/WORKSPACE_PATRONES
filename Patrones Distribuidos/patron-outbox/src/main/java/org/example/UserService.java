package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

class UserService {

    public void createUser(String username) {
        // 1. Definimos el evento
        OutboxEvent event = new OutboxEvent(
                UUID.randomUUID(),
                "USER_CREATED",
                "{\"username\": \"" + username + "\"}",
                LocalDateTime.now()
        );

        // 2. Guardamos ambos en la misma transacción
        MockDatabase.saveUserWithEvent(username, event);
    }

}
