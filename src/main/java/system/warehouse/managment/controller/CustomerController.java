package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.service.DefaultCustomerService;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    DefaultCustomerService DefaultCustomerService;

    // GET
    // Available customers
    @GetMapping("/customer")
    public List<Customer> getCustomer(){
        return DefaultCustomerService.findAll();
    }

    //GET CUSTOMER BY ID
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return DefaultCustomerService.findOneById(id);
    }

    //POST
    //Make an order

    //Pay for order

    //PUT

    //DELETE
    // Cancel order
}
