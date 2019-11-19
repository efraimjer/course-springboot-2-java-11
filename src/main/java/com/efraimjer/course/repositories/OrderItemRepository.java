package com.efraimjer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efraimjer.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
