package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> findAll();
    Inventory findOneById(Integer id);
    Inventory create(String location, Integer product_id, Integer stock,Integer onOrder, Integer supplier_id);
    Inventory edit(Integer id, String location, Integer stock);
    void delete(Integer id);
}
