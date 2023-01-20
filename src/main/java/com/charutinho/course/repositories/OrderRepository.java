package com.charutinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charutinho.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
