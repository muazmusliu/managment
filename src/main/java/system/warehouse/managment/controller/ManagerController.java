package system.warehouse.managment.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.warehouse.managment.payload.CreateProductInput;
import system.warehouse.managment.payload.EditProductInput;
import system.warehouse.managment.pojo.Product;
import system.warehouse.managment.service.DefaultProductService;


import java.util.List;

@RestController
public class ManagerController {
    @Autowired
    DefaultProductService defaultProductService;


    // Auth
    // Login

    // Logout


    // These routes can be accessed only by authenticated as a manager
    //GET
    // All Products
    @GetMapping("/products")
    public List<Product> getProduct(){
        return defaultProductService.findAll();
    }
    // Product by id
    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable Integer id){
        return defaultProductService.findOneById(id);
    }
    // Products by sku
    @GetMapping("/product/sku_number/{skuNumber}")
    public List<Product> getProductBySku(@PathVariable String skuNumber){
        return defaultProductService.findBySkuNumber(skuNumber);
    }

    //POST
    // Create product
    @PostMapping("/product/post")
    public Product createProduct(@RequestBody CreateProductInput cpi){
        String name= cpi.getName();
        String description = cpi.getDescription();
        String skuNumber = cpi.getSkuNumber();
        Double price = cpi.getPrice();
        Double measuringUnit = cpi.getMeasuringUnit();
        return defaultProductService.create(name,description,skuNumber,price,measuringUnit);
    }
    //PUT
    //Update product
    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody EditProductInput epi){
        String name = epi.getName();
        String description = epi.getDescription();
        Double price = epi.getPrice();
       return defaultProductService.edit(id,name,description,price);
    }

    //Update profile

    //DELETE
    // Delete product
    @DeleteMapping("/product/{id}")
    public List<Product> deleteProduct(@PathVariable Integer id){
         defaultProductService.delete(id);
         return defaultProductService.findAll();
    }
    // Delete account

}
