package com.example.demo.model.Contract.Service;
import static javax.persistence.CascadeType.ALL;

import javax.persistence.*;
import java.util.List;

@Entity
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "Type_Service_id")
    private Long id;

    private String name;

    @OneToMany(targetEntity = Service.class,cascade = ALL)
    @JoinColumn(name = "typeService_id")
    private List<Service> services;

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

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
