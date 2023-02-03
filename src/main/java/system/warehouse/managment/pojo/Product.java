package system.warehouse.managment.pojo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "description", length = 500)
    private String description;
    @Column(name = "sku_number")
    private String skuNumber;
    @Column(name = "price")
    private Double price;
    @Column(name = "measuring_unit")
    private Double measuringUnit;


    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private Set<OrderProduct> orderProducts = new HashSet<OrderProduct>();

    public Product(String name, String description, String skuNumber, Double price, Double measuringUnit) {
        this.name = name;
        this.description = description;
        this.skuNumber = skuNumber;
        this.price = price;
        this.measuringUnit = measuringUnit;
    }

    public Product() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(Double measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public String getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(String skuNumber) {
        this.skuNumber = skuNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
