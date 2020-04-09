package dao;

import model.Customer;

import java.util.*;

public class CustomerDao {
    private static final Map<Integer, Customer> listCUSTOMER = new HashMap<Integer, Customer>();

    static{
        initCustomers();
    }
    private static void initCustomers(){
        Customer cus1= new Customer(1,"Doan Chinh Thuan","094637437","tien1@gmail.com");
        Customer cus2= new Customer(2,"Doan Du","0384752832","tien2@gmail.com");
        Customer cus3= new Customer(3,"Mo Dung Phuc","0123728732","tien3@gmail.com");
        Customer cus4= new Customer(4,"Luong Xuan Ba","093828382","tien4@gmail.com");
        listCUSTOMER.put(cus1.getId(), cus1);
        listCUSTOMER.put(cus2.getId(), cus2);
        listCUSTOMER.put(cus3.getId(), cus3);
        listCUSTOMER.put(cus4.getId(), cus4);
    }

    //viet truong trinh xu li thong tin chi tiet cua 1 customer theo id
    public static Customer getCustomer(int customerId) {
        return listCUSTOMER.get(customerId);
    }

    // phuong thcu them moi customer
    public static void addCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
    }

    // phuong thuc update thong tin customer
    public static Customer updateAndCreateCustomer(Customer customer) {
        listCUSTOMER.put(customer.getId(), customer);
        return customer;
    }

    // phuong thuc delete 1 customer theo id
    public static void deleteCustomer(int customerId) {
        listCUSTOMER.remove(customerId);
    }
    //phuong thuc lay danh sach cútomer
    public static List<Customer> getAllCustomer(){
        return new ArrayList<>(listCUSTOMER.values());
    }
}
