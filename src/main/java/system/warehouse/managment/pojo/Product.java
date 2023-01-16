package system.warehouse.managment.pojo;

public class Product {
    private String name;
    private String description;
    private double price;
    private double measuringUnit;
    private int stock;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(double measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
