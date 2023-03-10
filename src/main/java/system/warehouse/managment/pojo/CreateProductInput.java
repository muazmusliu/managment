package system.warehouse.managment.pojo;

public class CreateProductInput {
    private String name;
    private String description;
    private String skuNumber;
    private Double price;
    private Double measuringUnit;

    public CreateProductInput() {
    }

    public CreateProductInput(String name, String description, String skuNumber, Double price, Double measuringUnit) {
        this.name = name;
        this.description = description;
        this.skuNumber = skuNumber;
        this.price = price;
        this.measuringUnit = measuringUnit;
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

    public Double getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(Double measuringUnit) {
        this.measuringUnit = measuringUnit;
    }
}
