package org.example;

interface SagaStep {
    boolean execute();
    void compensate();
}
