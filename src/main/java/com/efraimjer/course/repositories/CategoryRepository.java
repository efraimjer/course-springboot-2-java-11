package com.efraimjer.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.efraimjer.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
