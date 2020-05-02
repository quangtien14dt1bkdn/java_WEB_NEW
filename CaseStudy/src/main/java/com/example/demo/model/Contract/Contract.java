package com.example.demo.model.Contract;

import com.example.demo.model.Contract.ContractDetail.ContractDetail;
import com.example.demo.model.Contract.Customer.Customer;
import com.example.demo.model.Contract.Employee.Employee;
import com.example.demo.model.Contract.Service.Service;

import javax.persistence.*;
import static javax.persistence.CascadeType.ALL;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id")
    private Long id;

    @ManyToOne(targetEntity = Service.class,cascade = ALL)
    @JoinColumn(name = "service")
    private Service service;

    @ManyToOne(targetEntity = Customer.class,cascade =  ALL)
    @JoinColumn(name = "customer")
    private Customer customer;

    @ManyToOne(targetEntity = Employee.class,cascade = ALL)
    @JoinColumn(name = "employee")
    private Employee employee;

    @ManyToOne(targetEntity = ContractDetail.class, cascade = ALL)
    @JoinColumn(name = "contract_detail")
    private ContractDetail contractDetail;


    private String date_of_making;
    private String date_of_end;
    private Float deposits;
    private Float sum_price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ContractDetail getContractDetail() {
        return contractDetail;
    }

    public void setContractDetail(ContractDetail contractDetail) {
        this.contractDetail = contractDetail;
    }

    public String getDate_of_making() {
        return date_of_making;
    }

    public void setDate_of_making(String date_of_making) {
        this.date_of_making = date_of_making;
    }

    public String getDate_of_end() {
        return date_of_end;
    }

    public void setDate_of_end(String date_of_end) {
        this.date_of_end = date_of_end;
    }

    public Float getDeposits() {
        return deposits;
    }

    public void setDeposits(Float deposits) {
        this.deposits = deposits;
    }

    public Float getSum_price() {
        return sum_price;
    }

    public void setSum_price(Float sum_price) {
        this.sum_price = sum_price;
    }
}
