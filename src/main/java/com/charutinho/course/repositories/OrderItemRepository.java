package com.charutinho.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charutinho.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
