package data;

import model.Customer;

import java.util.HashMap;
import java.util.Map;

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
}
