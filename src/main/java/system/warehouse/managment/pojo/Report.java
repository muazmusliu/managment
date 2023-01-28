package system.warehouse.managment.pojo;

import java.util.List;

public class Report {
    private Integer id;
    private List<Inventory> inventory;
    private List<Order> sales;
    private List<Order> fulfillment;

    //getters and setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public List<Order> getSales() {
        return sales;
    }

    public void setSales(List<Order> sales) {
        this.sales = sales;
    }

    public List<Order> getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(List<Order> fulfillment) {
        this.fulfillment = fulfillment;
    }
}
