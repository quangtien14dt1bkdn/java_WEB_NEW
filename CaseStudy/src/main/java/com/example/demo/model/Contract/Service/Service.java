package com.example.demo.model.Contract.Service;

import com.example.demo.model.Contract.Contract;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private Long id;

    @ManyToOne(targetEntity = RentType.class,cascade = ALL)
    @JoinColumn(name = "type_rent")
    private RentType rentType;

    @ManyToOne(targetEntity = ServiceType.class,cascade = ALL)
    @JoinColumn(name = "type_service")
    private ServiceType serviceType;

    private Float area;
    private Integer floors;
    private Integer max_size_people;
    private Float cost;
    private String status;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    @OneToMany(targetEntity = Contract.class,cascade = ALL)
    @JoinColumn(name="contract_id")
    private List<Contract> contracts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Float getArea() {
        return area;
    }

    public void setArea(Float area) {
        this.area = area;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getMax_size_people() {
        return max_size_people;
    }

    public void setMax_size_people(Integer max_size_people) {
        this.max_size_people = max_size_people;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
