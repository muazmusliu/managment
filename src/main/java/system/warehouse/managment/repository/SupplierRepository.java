package system.warehouse.managment.repository;

import org.springframework.data.repository.CrudRepository;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.pojo.Supplier;

import java.util.List;
import java.util.Optional;

public interface SupplierRepository extends CrudRepository<Supplier, Integer> {
    List<Supplier> findAll();
    Optional<Supplier> findById(Integer id);
    Optional<Supplier> findByName(String name);
    List<Supplier> findAllProducts(List<Product> products);
    List<Supplier> findByContact(String contact);
}
