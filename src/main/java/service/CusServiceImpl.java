package service;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import repository.CusRepo;

import java.util.List;

public class CusServiceImpl implements CusService {

    @Autowired
    CusRepo cusRepo;

    @Override
    public List<Customer> listCustomer() {
        return cusRepo.listCustomer();
    }

    @Override
    public Customer findByID() {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void updade(Customer customer) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void create(int id, Customer customer) {

    }


}
