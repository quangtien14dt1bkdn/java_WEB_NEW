package com.example.demo.service;

import com.example.demo.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    Category findById(Long id);

    Page<Category> findAllByNameContaining(String name, Pageable pageable);



    void save(Category category);

    void remove(Long id);
}