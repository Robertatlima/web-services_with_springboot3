package com.learnjava.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.project.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
