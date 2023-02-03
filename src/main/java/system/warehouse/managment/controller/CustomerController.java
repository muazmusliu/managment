package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.warehouse.managment.payload.CreateCustomerInput;
import system.warehouse.managment.payload.CreateOrderInput;
import system.warehouse.managment.payload.OrderProd;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.pojo.Order;
import system.warehouse.managment.service.DefaultCustomerService;
import system.warehouse.managment.service.DefaultOrderService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    DefaultCustomerService defaultCustomerService;
    @Autowired
    DefaultOrderService defaultOrderService;
    // GET
    // Available customers
    @GetMapping("/customer")
    public List<Customer> getCustomer(){
        return defaultCustomerService.findAll();
    }

    //GET CUSTOMER BY ID
    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return defaultCustomerService.findOneById(id);
    }



    //POST
    //Make an order

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody CreateCustomerInput cci){
        String name=cci.getName();
        String phone=cci.getPhone();
        String email= cci.getEmail();
        return defaultCustomerService.create(name,phone,email);
    }

    @PostMapping("/order")
    public Order createOrder(@RequestBody CreateOrderInput coi){
        String orderNumber = coi.getOrderNumber();
        Integer customerId =  coi.getCustomerId();
        ArrayList<OrderProd> orderProds = coi.getOrderProds();
        String status = coi.getStatus();
        return defaultOrderService.create(orderNumber,customerId,orderProds,status);
    }
    //Pay for order

    //PUT

    //DELETE
    // Cancel order
}
