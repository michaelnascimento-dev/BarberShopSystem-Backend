package com.michael.barbershop_backend.model;

public enum BookingStatus {
    SCHEDULED,   // Agendado
    COMPLETED,   // Concluído
    CANCELLED,   // Cancelado pelo cliente
    NO_SHOW      // Cliente não compareceu
}