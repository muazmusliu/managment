package system.warehouse.managment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import system.warehouse.managment.pojo.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Optional<Product> findBySkuNumber(Integer skuNumber);
    List<Product> findByNameContaining(String name);

}