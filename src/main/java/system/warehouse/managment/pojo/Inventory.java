package system.warehouse.managment.pojo;

public class Inventory {
    private Long id;
    private Product product;
    private Integer stock;
    private Integer onOrder;

    //getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
}
