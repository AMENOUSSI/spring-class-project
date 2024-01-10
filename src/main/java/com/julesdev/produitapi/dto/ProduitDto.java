package com.julesdev.produitapi.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProduitDto {
    private int id;
    private String nom;
    private double prix;

    private int category_id;
}
