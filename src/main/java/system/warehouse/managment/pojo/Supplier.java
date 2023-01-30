package system.warehouse.managment.pojo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name = "contact")
    private String contact;

    @Column(name="address")
    private String address;

    @OneToMany
    private List<Inventory> inventory;
    private String payment;

    public Supplier() {
    }

    public Supplier( String name, String contact, String address, List<Inventory> inventory, String payment) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.inventory = inventory;
        this.payment = payment;
    }

    //getters and setters

    public Integer getId() {
        return id;
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

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
