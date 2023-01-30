package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Inventory;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.pojo.Supplier;
import system.warehouse.managment.repository.InventoryRepository;
import system.warehouse.managment.repository.ProductRepository;
import system.warehouse.managment.repository.SupplierRepository;

import java.util.List;

@Service
public class DefaultInventoryService implements InventoryService{

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Inventory> findAll() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory findOneById(Integer id) {
        return inventoryRepository.findInventoryById(id);
    }

    @Override
    public Inventory create(String location, Integer product_id, Integer stock, Integer supplier_id) {
        Product product = productRepository.findProductById(product_id);
        Supplier supplier = supplierRepository.findSupplierById(supplier_id);
        Inventory inventory = new Inventory(location, product, stock, 0, supplier);
        return inventoryRepository.save(inventory);
    }

    @Override
    public Inventory edit(Integer id, String location, Integer stock) {
        Inventory inventory = inventoryRepository.findInventoryById(id);
        if (inventory != null) {
            inventory.setLocation(location);
            inventory.setStock(stock);
            return inventoryRepository.save(inventory);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        inventoryRepository.deleteById(id);
    }
}
