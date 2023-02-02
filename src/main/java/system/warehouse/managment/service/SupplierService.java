package system.warehouse.managment.service;


import system.warehouse.managment.pojo.Supplier;

import java.util.List;

public interface SupplierService {
    List<Supplier> findAll();
    Supplier findOneById(Integer id);
    Supplier create(String name, String contact, String address, Boolean payment);
    Supplier edit(Integer id, String name, String contact, String address, Boolean payment);
    void delete(Integer id);
    List<Supplier> findByPayment(Boolean payment);
}
