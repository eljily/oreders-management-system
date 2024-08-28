package com.sidibrahim.oms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;
    @ManyToOne
    private Category category;// e.g., "Beverages", "Appetizers", "Main Course", etc.
    private String imageUrl;
}
