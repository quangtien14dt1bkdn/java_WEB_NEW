package com.example.demo.model.Contract.Service;

import javax.persistence.*;
import java.util.List;
import static javax.persistence.CascadeType.ALL;

@Entity
public class RentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rent_type_id")
    private Long id;

    private String name;
    private Long price;

@OneToMany(targetEntity = Service.class,cascade = ALL)
    @JoinColumn(name = "service_id")
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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
