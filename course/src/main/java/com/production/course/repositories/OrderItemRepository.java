package com.production.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.production.course.entities.OrderItem;
import com.production.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
