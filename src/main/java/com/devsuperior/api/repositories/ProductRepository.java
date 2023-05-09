package com.devsuperior.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.api.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
