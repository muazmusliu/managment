package system.warehouse.managment.service;


import system.warehouse.managment.pojo.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> findAll();
    Supplier findOneById(Integer id);
    Supplier create(String name, String contact, String address);
    Supplier edit(Integer id, String name, String contact, String address);
    void delete(Integer id);
}
