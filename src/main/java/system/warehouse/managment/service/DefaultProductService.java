package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.repository.InventoryRepository;
import system.warehouse.managment.repository.ProductRepository;

import java.util.List;

@Service
public class DefaultProductService implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findOneById(Integer id) {
        return productRepository.findProductById(id);
    }

    @Override
    public Product create(String name, String description, Double price) {
        //Inventory inventory = inventoryRepository.findInventoryById(findOne);

        Product product = new Product();
        product.setName(name);
        product.setDescription(description);
        product.setPrice(price);
        //product.setProduct(inventory)...

        return productRepository.save(product);
    }

    @Override
    public Product edit(Integer id, String name, String description, Double price) {
        Product product = productRepository.findProductById(id);
        if (product != null) {
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            return productRepository.save(product);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
