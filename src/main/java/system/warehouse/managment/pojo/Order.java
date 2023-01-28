package system.warehouse.managment.pojo;

import java.util.List;

public class Order {
    private Integer id;
    private String orderNumber;
    private Customer customer;
    private List<Product> products;
    private String status;

    public Order(Integer id, String orderNumber, Customer customer, List<Product> products, String status) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.products = products;
        this.status = status;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

