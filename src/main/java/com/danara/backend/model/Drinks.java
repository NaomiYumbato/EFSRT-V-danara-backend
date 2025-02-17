package com.danara.backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "drinks")
@PrimaryKeyJoinColumn(name = "product_id")
public class Drinks extends Product {

    @ManyToOne
    @JoinColumn(name = "size_id", nullable = false)
    private Size size;

}

