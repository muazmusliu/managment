package system.warehouse.managment.payload;

import system.warehouse.managment.pojo.Inventory;

import java.util.ArrayList;
import java.util.List;

public class CreateSupplierInput {
    private String name;
    private String contact;
    private String address;

    private Boolean payment;

    public CreateSupplierInput() {
    }

    public CreateSupplierInput(String name, String contact, String address, Boolean payment) {
        this.name = name;
        this.contact = contact;
        this.address = address;
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

    public Boolean getPayment() {
        return payment;
    }

    public void setPayment(Boolean payment) {
        this.payment = payment;
    }
}
