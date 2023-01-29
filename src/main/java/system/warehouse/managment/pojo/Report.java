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
    private Order order;

    @Column(name = "sold")
    private Boolean sold;

    public Report() {
    }


}
