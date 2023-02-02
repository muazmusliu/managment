package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.warehouse.managment.pojo.CreateProductInput;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.service.DefaultProductService;


import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    DefaultProductService DefaultProductService;


    // Auth
    // Login

    // Logout


    // These routes can be accessed only by authenticated as a manager
    //GET
    // All Products
    @GetMapping("/product")
    public List<Product> getProduct(){
        return DefaultProductService.findAll();
    }
    // Product by id
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Integer id){
        return DefaultProductService.findOneById(id);
    }
    // Products by sku
    @GetMapping("/product/{skuNumber}")
    public List<Product> getProduct(@PathVariable String skuNumber){
        return DefaultProductService.findBySkuNumber(skuNumber);
    }

    //POST
    // Create product
    @PostMapping("/product")
    public Product createProduct(@RequestBody CreateProductInput cpi){
        String name= cpi.getName();
        String description = cpi.getDescription();
        String skuNumber = cpi.getSkuNumber();
        Double price = cpi.getPrice();
        Double measuringUnit = cpi.getMeasuringUnit();
        return DefaultProductService.create(name,description,skuNumber,price,measuringUnit);
    }
    //PUT
    //Update product

    //Update profile

    //DELETE
    // Delete product

    // Delete account

}
