package com.julesdev.produitapi.dao;

import com.julesdev.produitapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Locale;

public interface CategoryRepository extends JpaRepository <Category,Long> {
}
