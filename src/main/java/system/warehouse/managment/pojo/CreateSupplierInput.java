package system.warehouse.managment.pojo;

import java.util.List;

public class CreateSupplierInput {
    private String name;
    private String contact;
    private String address;
    private List<Inventory> inventory;
    private Boolean payment;

    public CreateSupplierInput() {
    }

    public CreateSupplierInput(String name, String contact, String address, List<Inventory> inventory, Boolean payment) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.inventory = inventory;
        this.payment = payment;
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

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }
}
