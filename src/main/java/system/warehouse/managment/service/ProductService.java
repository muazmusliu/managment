package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findOneById(Integer id);
    Product create(String name, String description, Integer skuNumber, Double price, Double measuringUnit);
    Product edit(Integer id, String name, String description, Double price);
    void delete(Integer id);
}
