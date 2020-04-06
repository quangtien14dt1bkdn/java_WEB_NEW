package data;

import model.Customer;

import java.util.Collections;

import java.util.*;

public class CustomerData {
    private static final Map<Integer, Customer> ListCustomer = new HashMap<Integer, Customer>();
    static{
        initCustomer();
    }
    private static void initCustomer() {
        Customer cus1 = new Customer(1, "Tran Huyen Phong", "0121143532", "whynotme1211@gmail.com");
        Customer cus2 = new Customer(2, "Pham Bang Bang", "046464664", "quangtien14dt1@gmail.com");
        Customer cus3 = new Customer(3, "Tuong Han", "0774834283", "waltzintolove@gmail.com");
        Customer cus4 = new Customer(4, "Doan Chinh Thuan", "082327312", "thaylopxelu@yahoo.com");

        ListCustomer.put(cus1.getId(), cus1);
        ListCustomer.put(cus2.getId(), cus2);
        ListCustomer.put(cus3.getId(), cus3);
        ListCustomer.put(cus4.getId(), cus4);

    }

    // phương thức xử lí get thông tin chi tiêt của 1 customer theo id
    public static Customer getCustomer(int customerID) {
        return ListCustomer.get(customerID);
    }
// phuong thuc them customer
    public static void addCustomer(Customer customer) {
        ListCustomer.put(customer.getId(), customer);
    }

    //viet phuong thuc update thong tin 1 customer
    public static Customer updateCustomer(Customer customer) {
        ListCustomer.put(customer.getId(), customer);
        return customer;
    }

    // viet phuong thuc delete 1 customer theo id
    public static void deleteCustomer(int customerID) {
        ListCustomer.remove(customerID);
    }

    //viet phuong thuc lay danh sach tat ca cac custoemr
    public static List<Customer> getAllCustomer(){
        Collections<Customer> c = ListCustomer.values();
        List<Customer> List = new ArrayList<Customer>();
        List.addAll(c);
        return List;
    }
}
