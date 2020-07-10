package com.ae.products.repository;

import com.ae.products.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
