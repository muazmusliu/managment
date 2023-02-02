package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findOneById(Integer id);
    Customer create(String name, String phone,String email);
    Customer edit(Integer id, String name, String phone,String email);
    void delete(Integer id);
}
