package com.danara.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inputs")
@PrimaryKeyJoinColumn(name = "product_id")
public class Inputs extends Product {

    @Column(nullable = false)
    private int stock;

    @ManyToOne
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;

}

