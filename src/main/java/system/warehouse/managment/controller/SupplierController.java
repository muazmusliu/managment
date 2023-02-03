package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.warehouse.managment.payload.CreateInventoryInput;
import system.warehouse.managment.payload.CreateSupplierInput;
import system.warehouse.managment.pojo.Inventory;
import system.warehouse.managment.pojo.Supplier;
import system.warehouse.managment.service.DefaultInventoryService;
import system.warehouse.managment.service.DefaultSupplierService;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    DefaultSupplierService defaultSupplierService;
    @Autowired
    DefaultInventoryService defaultInventoryService;
    //GET
    @GetMapping("/suppliers")
    public List<Supplier> getSupplier(){
        return defaultSupplierService.findAll();
    }

    @GetMapping("/supplier/{id}")
    public Supplier getSupplierById(@PathVariable Integer id){
        return defaultSupplierService.findOneById(id);
    }

    @GetMapping("/supplier/paid")
    public List<Supplier> getPaidSuppliers(@RequestParam Boolean payment){
        return defaultSupplierService.findByPayment(payment);
    }
    @GetMapping("/inventories")
    public List<Inventory> getInventory(){
        return defaultInventoryService.findAll();
    }


    //POST
    @PostMapping("/supplier")
    public Supplier createSupplier(@RequestBody CreateSupplierInput csi){
        String name= csi.getName();
        String contact = csi.getContact();
        String address = csi.getAddress();
        Boolean payment = csi.getPayment();
        return defaultSupplierService.create(name,contact,address,payment);
    }

    @PostMapping("/inventory")
    public Inventory createInventory(@RequestBody CreateInventoryInput cii){
        String location= cii.getLocation();
        Integer productId=cii.getProductId();
        Integer stock=cii.getStock();
        Integer onOrder=cii.getOnOrder();
        Integer supplierId=cii.getSupplierId();
        return defaultInventoryService.create(location,productId,stock,onOrder,supplierId);
    }

    //PUT
//    @PutMapping("/supplier/{id}")
//    public Supplier updateSupplier(@RequestBody CreateSupplierInput csi){
//        Integer id = csi.getId();
//        String name = csi.getName();
//        String contact = csi.getContact();
//        String address = csi.getAddress();
//        Boolean payment = csi.getPayment();
//        return DefaultSupplierService.edit(id, name, contact, address, payment);
//    }


}
