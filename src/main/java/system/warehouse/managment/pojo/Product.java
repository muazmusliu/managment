package system.warehouse.managment.pojo;

public class Product {
    private Integer id;
    private String name;
    private String description;
    private Integer skuNumber;
    private Double price;
    private Double measuringUnit;
    private Integer stock;

    public Product(Integer id, String name, String description, Integer skuNumber, Double price, Double measuringUnit, Integer stock) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.skuNumber = skuNumber;
        this.price = price;
        this.measuringUnit = measuringUnit;
        this.stock = stock;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
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
