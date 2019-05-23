package repository;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CusRepoImpl implements CusRepo {

    List<Customer> listCustomer = new ArrayList<>();
    {
        listCustomer.add(new Customer(1,"Duong"));
        listCustomer.add(new Customer(2,"Duong"));
        listCustomer.add(new Customer(3,"Duong"));
    }

    @Override
    public List<Customer> listCustomer() {
        return listCustomer;
    }
}
