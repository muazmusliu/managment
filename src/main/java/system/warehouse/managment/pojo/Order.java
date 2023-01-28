package system.warehouse.managment.pojo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "order_number")
    private String orderNumber;
    @ManyToOne
    @JoinColumn(name = "costumer_id")
    private Customer customer;
    @OneToMany
    private List<Product> products;
    @Column(name = "status")
    private String status;

    public Order(Integer id, String orderNumber, Customer customer, List<Product> products, String status) {
        this.id = id;
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.products = products;
        this.status = status;
    }

    public Order() {

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

