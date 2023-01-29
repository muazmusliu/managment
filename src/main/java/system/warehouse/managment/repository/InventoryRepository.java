package system.warehouse.managment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import system.warehouse.managment.pojo.Inventory;
import system.warehouse.managment.pojo.Product;

import java.util.List;

@Repository
public interface InventoryRepository extends CrudRepository<Inventory, Integer> {
    Inventory findInventoryById(Integer id);
    List<Inventory> showAllStock(Integer stock);
}
