package com.example.demo.repo.employee;

import com.example.demo.model.Contract.Employee.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DegreeRepository extends JpaRepository<Degree, Long> {
}
