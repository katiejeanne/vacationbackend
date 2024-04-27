package dev.katiejeanne.d288oa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    @JsonProperty("id")
    @Getter
    private Long cartId;

    @Column(name = "order_tracking_number")
    @JsonProperty("orderTrackingNumber")
    @Getter
    @Setter
    private String orderTrackingNumber;

    @Column(name = "package_price")
    @JsonProperty("package_price")
    @Getter
    @Setter
    private BigDecimal packagePrice;

    @Column(name = "party_size")
    @JsonProperty("party_size")
    @Getter
    @Setter
    private int partySize;

    @Enumerated
    @Column(name = "status")
    @JsonProperty("status")
    @Getter
    @Setter
    private StatusType status;

    @CreationTimestamp
    @Column(name = "create_date")
    @JsonProperty("create_date")
    @Getter
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "last_update")
    @JsonProperty("last_update")
    @Getter
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonProperty("customer")
    @Getter
    @Setter
    private Customer customer;
}
