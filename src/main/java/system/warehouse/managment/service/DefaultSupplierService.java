package system.warehouse.managment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.warehouse.managment.pojo.Supplier;
import system.warehouse.managment.repository.SupplierRepository;

import java.util.List;

@Service
public class DefaultSupplierService implements SupplierService{

    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findOneById(Integer id) {
        return supplierRepository.findSupplierById(id);
    }

    @Override
    public Supplier create(String name, String contact, String address, String payment) {
        Supplier supplier = new Supplier(name, contact, address, payment);

        return supplierRepository.save(supplier);
    }

    @Override
    public Supplier edit(Integer id, String name, String contact, String address, String payment) {
        Supplier supplier = supplierRepository.findSupplierById(id);
        if (supplier != null) {
            supplier.setName(name);
            supplier.setContact(contact);
            supplier.setAddress(address);
            supplier.setPayment(payment);
            return supplierRepository.save(supplier);
        }
        return null;
    }

    @Override
    public void delete(Integer id) {
        supplierRepository.deleteById(id);
    }
}
