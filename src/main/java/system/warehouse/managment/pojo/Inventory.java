package system.warehouse.managment.pojo;

public class Inventory {
    private Integer id;
    private Product product;
    private Integer stock;
    private Integer onOrder;

    public Inventory(Integer id, Product product, Integer stock, Integer onOrder) {
        this.id = id;
        this.product = product;
        this.stock = stock;
        this.onOrder = onOrder;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
