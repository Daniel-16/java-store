package com.javastore.javastore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javastore.javastore.models.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
