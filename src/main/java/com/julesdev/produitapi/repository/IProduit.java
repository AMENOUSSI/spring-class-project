package com.julesdev.produitapi.repository;

import com.julesdev.produitapi.dto.ProduitDto;
import com.julesdev.produitapi.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduit extends JpaRepository<Produit,Integer> {

    public ProduitDto convertEntityToDto(Produit produit);

    public Produit convertDtoToEntity(ProduitDto produitDto);
}
