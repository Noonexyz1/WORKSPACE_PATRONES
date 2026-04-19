package org.example;

import java.time.LocalDateTime;
import java.util.UUID;

// Representa el evento que queremos enviar
record OutboxEvent(
        UUID id,
        String aggregateType,
        String payload,
        LocalDateTime createdAt
) {}
