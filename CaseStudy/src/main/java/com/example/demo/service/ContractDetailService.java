package com.example.demo.service;


import com.example.demo.model.Contract.ContractDetail.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);



    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);


}
