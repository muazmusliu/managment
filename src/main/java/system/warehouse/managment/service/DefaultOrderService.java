package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.payload.CreateOrderInput;
import system.warehouse.managment.payload.OrderProd;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.pojo.Order;
import system.warehouse.managment.pojo.OrderProduct;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.repository.CustomerRepository;
import system.warehouse.managment.repository.OrderRepository;
import system.warehouse.managment.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DefaultOrderService implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findOneById(Integer id) {
        return orderRepository.findOrderById(id);
    }

    @Override
    public Order create(String orderNumber, Integer customer_id, ArrayList<OrderProd> productIds, String status) {
        Customer customer = customerRepository.findCustomerById(customer_id);
        Set<OrderProduct> orderProducts  = new HashSet<>();
        Order order = new Order();
        for (OrderProd orderProd: productIds) {
            Product product = productRepository.findProductById(orderProd.productId());
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setProduct(product);
            orderProduct.setAmount(orderProd.amount());
            orderProduct.setOrder(order);
            orderProducts.add(orderProduct);

        }


        order.setOrderNumber(orderNumber);
        order.setCustomer(customer);
        order.setOrderProducts(orderProducts);
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
