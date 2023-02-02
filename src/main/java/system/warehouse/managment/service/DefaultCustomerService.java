package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultCustomerService implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findOneById(Integer id) {
        return customerRepository.findCustomerById(id);
    }

    @Override
    public Customer create(String name, String phone, String email) {

        Customer customer = new Customer(name,phone,email,new ArrayList<>());

        return customerRepository.save(customer);
    }

    @Override
    public Customer edit(Integer id, String name, String phone, String email) {
        Customer customer = customerRepository.findCustomerById(id);
        if (customer != null) {
            customer.setName(name);
            customer.setPhone(phone);
            customer.setEmail(email);
            return customerRepository.save(customer);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        customerRepository.deleteById(id);
    }
}
