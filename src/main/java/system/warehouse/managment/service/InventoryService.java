package system.warehouse.managment.service;

import system.warehouse.managment.pojo.Inventory;

import java.util.List;

public interface InventoryService {
    List<Inventory> findAll();
    Inventory findOneById(Integer id);
    Inventory create(String location);
    Inventory edit(Integer id, String location);
    void delete(Integer id);
}
