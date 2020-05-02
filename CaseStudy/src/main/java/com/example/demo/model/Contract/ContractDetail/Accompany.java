package com.example.demo.model.Contract.ContractDetail;



import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Accompany {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String name;
    private Float cost;
    private Integer numbers_of_service;
    private String status;

    @OneToMany(targetEntity = ContractDetail.class, cascade = ALL)
    private List<ContractDetail> contractDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public Integer getNumbers_of_service() {
        return numbers_of_service;
    }

    public void setNumbers_of_service(Integer numbers_of_service) {
        this.numbers_of_service = numbers_of_service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(List<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
