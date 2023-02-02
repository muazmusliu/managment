package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.warehouse.managment.pojo.CreateSupplierInput;
import system.warehouse.managment.pojo.Supplier;
import system.warehouse.managment.service.DefaultSupplierService;

import java.util.List;

@RestController
public class SupplierController {

    @Autowired
    DefaultSupplierService DefaultSupplierService;


    //GET
    @GetMapping("/supplier")
    public List<Supplier> getSupplier(){
        return DefaultSupplierService.findAll();
    }

    @GetMapping("/supplier/{id}")
    public Supplier getSupplierById(@PathVariable Integer id){
        return DefaultSupplierService.findOneById(id);
    }

    @GetMapping("/supplier")
    public List<Supplier> getPaidSuppliers(@RequestParam Boolean payment){
        return DefaultSupplierService.findByPayment(payment);
    }


    //POST
    @PostMapping("/supplier")
    public Supplier createSupplier(@RequestBody CreateSupplierInput csi){
        String name= csi.getName();
        String contact = csi.getContact();
        String address = csi.getAddress();
        Boolean payment = csi.getPayment();
        return DefaultSupplierService.create(name,contact,address,payment);
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
