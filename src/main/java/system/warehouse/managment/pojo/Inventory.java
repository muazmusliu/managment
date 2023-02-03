package system.warehouse.managment.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name="inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "location")
    private String location;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "on_order")
    private Integer onOrder;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="supplier_id")
    private Supplier supplier;


    public Inventory(String location, Product product, Integer stock, Integer onOrder, Supplier supplier) {
        this.location = location;
        this.product = product;
        this.stock = stock;
        this.onOrder = onOrder;
        this.supplier = supplier;
    }

    public Inventory() {

    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(Integer onOrder) {
        this.onOrder = onOrder;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
