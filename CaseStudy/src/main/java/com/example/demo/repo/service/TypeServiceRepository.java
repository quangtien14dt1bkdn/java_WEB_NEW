package com.example.demo.repo.service;

import com.example.demo.model.Contract.Service.ServiceType;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeServiceRepository extends PagingAndSortingRepository<ServiceType, Long> {

}
