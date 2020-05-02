package com.example.demo.repo.service;

import com.example.demo.model.Contract.Service.RentType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeRentRepository extends PagingAndSortingRepository<RentType, Long> {

}
