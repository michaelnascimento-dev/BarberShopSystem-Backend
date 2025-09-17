package com.michael.barbershop_backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name = "offered_services")
@Table(name = "offered_services")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OfferedService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer durationInMinutes;

    @Column(nullable = false)
    private Boolean active;

    @Column(length = 500)
    private String description;
}