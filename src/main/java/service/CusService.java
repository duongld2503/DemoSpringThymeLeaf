package service;

import model.Customer;

import java.util.List;

public interface CusService {

    List<Customer> listCustomer();

    Customer findByID();
    void delete(int id);
    void updade(Customer customer);
    void remove(int id);
    void create(int id, Customer customer);
}
