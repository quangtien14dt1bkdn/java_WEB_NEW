package com.example.demo.repo.contract_detail;

import com.example.demo.model.Contract.ContractDetail.ContractDetail;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContractDetailRepository extends PagingAndSortingRepository<ContractDetail, Long> {
}
