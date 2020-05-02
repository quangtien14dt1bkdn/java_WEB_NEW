package com.example.demo.repo.employee;

import com.example.demo.model.Contract.Employee.Part;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PartRepository extends PagingAndSortingRepository<Part, Long> {

}
