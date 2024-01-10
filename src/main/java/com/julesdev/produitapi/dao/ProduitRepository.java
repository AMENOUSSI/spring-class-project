package com.julesdev.produitapi.dao;

import com.julesdev.produitapi.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository <Produit,Long>{

}
