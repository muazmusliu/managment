package system.warehouse.managment.repository;

import org.springframework.data.repository.CrudRepository;
import system.warehouse.managment.pojo.Customer;
import system.warehouse.managment.pojo.Order;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    Optional<Customer> findById(Integer id);
    List<Customer> findAll();
    Customer delete(Integer id);
    List<Customer> findByName(String name);
    List<Customer> findByOrders(List<Order> orders);
}
