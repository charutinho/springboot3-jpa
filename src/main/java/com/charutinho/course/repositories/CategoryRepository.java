package com.charutinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charutinho.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
