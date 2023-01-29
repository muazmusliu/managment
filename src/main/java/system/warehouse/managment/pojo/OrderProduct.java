package system.warehouse.managment.pojo;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "order_product")
public class OrderProduct {
    @EmbeddedId
    private OrderProductId id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    private Order order;

    private Integer amount;


}
@Embeddable
class OrderProductId implements Serializable {

    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "order_id")
    private Integer orderId;

}