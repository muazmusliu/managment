package system.warehouse.managment.pojo;

import jakarta.persistence.*;

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
    private Integer skuNumber;
    @Column(name = "price")
    private Double price;
    @Column(name = "measuring_unit")
    private Double measuringUnit;

    public Product( String name, String description, Integer skuNumber, Double price, Double measuringUnit) {
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

    public Integer getSkuNumber() {
        return skuNumber;
    }

    public void setSkuNumber(Integer skuNumber) {
        this.skuNumber = skuNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
