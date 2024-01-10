package com.julesdev.produitapi.service;

import com.julesdev.produitapi.dto.ProduitDto;
import com.julesdev.produitapi.entity.Produit;

import java.util.List;

public interface IProduitService {
    public Produit saveProduct(ProduitDto produitDto);
    public List<ProduitDto> showAllProducts();

    public ProduitDto showOneProduct(int id);

    public void deleteProduct(int id);



}
