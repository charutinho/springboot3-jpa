package com.charutinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charutinho.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
