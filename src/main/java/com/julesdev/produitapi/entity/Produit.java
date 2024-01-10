package com.julesdev.produitapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nom;
    private double prix;
    //private boolean active;
    private LocalDate dateCreation;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}



