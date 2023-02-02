package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.pojo.Inventory;
import system.warehouse.managment.pojo.Order;
import system.warehouse.managment.repository.CustomerRepository;
import system.warehouse.managment.repository.OrderRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultOrderService implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOneById(Integer id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public Order create(String orderNumber, Integer customer_id, String status) {
        Customer customer = customerRepository.findCustomerById(customer_id);
        Order order = new Order(orderNumber, customer, new ArrayList<>(), status);
        return orderRepository.save(order);
    }

    @Override
    public Order edit(Integer id, String orderNumber, Integer costumer_id, String status) {
        Order order = orderRepository.findOrderById(id);
        if (order != null) {
            order.setOrderNumber(orderNumber);
            order.setStatus(status);
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        orderRepository.deleteById(id);
    }

}
