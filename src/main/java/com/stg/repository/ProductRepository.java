package com.stg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Product findByProductName(String productName);

}
