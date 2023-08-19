package com.learnjava.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.project.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
