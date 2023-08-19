package com.learnjava.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learnjava.project.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
