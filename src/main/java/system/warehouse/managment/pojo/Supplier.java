package system.warehouse.managment.pojo;

import java.util.List;

public class Supplier {
    private Integer id;
    private String name;
    private String contact;
    private String address;
    private List<Product> products;
    private String payment;

    public Supplier(Integer id, String name, String contact, String address, List<Product> products, String payment) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.products = products;
        this.payment = payment;
    }

    //getters and setters

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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
