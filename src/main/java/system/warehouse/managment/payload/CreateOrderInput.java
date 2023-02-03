package system.warehouse.managment.payload;

import java.util.ArrayList;
import java.util.List;

public class CreateOrderInput {
    private String orderNumber;
    private Integer customerId;
    private ArrayList<OrderProd> orderProds = new ArrayList<OrderProd>();
    private String status;

    public CreateOrderInput() {
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public ArrayList<OrderProd> getOrderProds() {
        return orderProds;
    }

    public void setOrderProds(ArrayList<OrderProd> orderProds) {
        this.orderProds = orderProds;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
