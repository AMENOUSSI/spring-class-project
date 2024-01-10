package com.julesdev.produitapi.repository;

import com.julesdev.produitapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategory extends JpaRepository<Category,Integer> {

}
