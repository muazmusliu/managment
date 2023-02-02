package system.warehouse.managment.pojo;

import jakarta.persistence.*;

import java.util.List;
//IN PROGRESS
@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    private List<Inventory> inventory;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "confirm_pay")
    private Boolean confirmPay;

    public Report() {
    }

    public Report( List<Inventory> inventory, Order order) {
        this.inventory = inventory;
        this.order = order;
        this.confirmPay = false;
    }

    public Integer getId() {
        return id;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Boolean getConfirmPay() {
        return confirmPay;
    }

    public void setConfirmPay(Boolean confirmPay) {
        this.confirmPay = confirmPay;
    }
}
