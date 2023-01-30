package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findOneById(Integer id);
    Order create(String orderNumber, Integer customer_id, String status);
    Order edit(Integer id, String orderNumber, Integer customer_id, String status);
    void delete(Integer id);
}
