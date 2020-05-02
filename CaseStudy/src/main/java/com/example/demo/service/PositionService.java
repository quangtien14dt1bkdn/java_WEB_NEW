package com.example.demo.service;
import com.example.demo.model.Contract.Employee.Position;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface PositionService {
    Page<Position> findAll(Pageable pageable);


    Position findById(Long id);

    void save(Position position);

    void remove(Long id);
}
