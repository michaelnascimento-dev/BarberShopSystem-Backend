package com.michael.barbershop_backend.repository;

import com.michael.barbershop_backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByCustomerId(Long customerId);

    List<Booking> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);

    List<Booking> findByStatus(com.michael.barbershop_backend.model.BookingStatus status);
}