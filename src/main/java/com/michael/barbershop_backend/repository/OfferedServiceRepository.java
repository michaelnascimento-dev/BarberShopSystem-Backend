package com.michael.barbershop_backend.repository;

import com.michael.barbershop_backend.model.OfferedService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferedServiceRepository extends JpaRepository<OfferedService, Long> {

    List<OfferedService> findByActiveTrue();
}