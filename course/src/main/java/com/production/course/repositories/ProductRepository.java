package com.production.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.production.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
