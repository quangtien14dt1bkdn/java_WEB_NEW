package com.toantr.webapp.persistence.repo;

import com.toantr.webapp.persistence.model.customertype.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerTypeRepo extends JpaRepository<CustomerType,Long>
{
    @Query("select ct from CustomerType ct")
    List<CustomerType> getAll();
}
