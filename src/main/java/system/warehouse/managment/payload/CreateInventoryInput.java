package system.warehouse.managment.payload;

public class CreateInventoryInput {
    String location;
    Integer productId;
    Integer stock;
    Integer onOrder;
    Integer supplierId;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getOnOrder() {
        return onOrder;
    }

    public void setOnOrder(Integer onOrder) {
        this.onOrder = onOrder;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }
}
