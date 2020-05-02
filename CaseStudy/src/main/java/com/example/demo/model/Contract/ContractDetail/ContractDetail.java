package com.example.demo.model.Contract.ContractDetail;

import com.example.demo.model.Contract.Contract;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private Integer numbers;

    @ManyToOne(targetEntity = Accompany.class)
    @JoinColumn(name = "service_come_with")
    private Accompany accompany;

    @OneToMany(targetEntity = Contract.class,cascade = ALL)
    @JoinColumn(name="contract_id")
    private List<Contract> contracts;

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public Accompany getAccompany() {
        return accompany;
    }

    public void setAccompany(Accompany accompany) {
        this.accompany = accompany;
    }
}
