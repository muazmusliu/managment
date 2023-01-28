package system.warehouse.managment.pojo;

public class Product {
    private String name;
    private String description;
    private Integer skuNumber;
    private Double price;
    private Double measuringUnit;
    private Integer stock;

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
