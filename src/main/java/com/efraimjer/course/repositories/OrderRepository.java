package com.efraimjer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efraimjer.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
