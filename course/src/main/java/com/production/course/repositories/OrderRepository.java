package com.production.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.production.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
