package com.example.demo.repo.employee;


import com.example.demo.model.Contract.Employee.Position;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PositionRepository extends PagingAndSortingRepository<Position,Long> {
}
