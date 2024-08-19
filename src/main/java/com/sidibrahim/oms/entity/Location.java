package com.sidibrahim.oms.entity;

import jakarta.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String code; // e.g., "P34", "VIP01"

    private String description; // e.g., "Poolside seat", "VIP Hall"

    // Constructors, getters, and setters
}
