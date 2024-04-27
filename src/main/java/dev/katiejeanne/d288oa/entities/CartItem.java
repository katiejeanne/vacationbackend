package dev.katiejeanne.d288oa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    @JsonProperty("id")
    @Getter
    private Long cartItemId;



    @ManyToOne
    @JoinColumn(name = "vacation_id")
    @JsonProperty("vacation")
    @Getter
    @Setter
    private Vacation vacation;


    @ManyToMany
    @JoinTable(
            name = "excursion_cartitem",
            joinColumns = { @JoinColumn(name = "cart_item_id") },
            inverseJoinColumns = { @JoinColumn(name = "excursion_id") } )
    @JsonProperty("excursions")
    @Getter
    @Setter
    private Set<Excursion> excursions;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    @JsonProperty("cart")
    @Getter
    @Setter
    private Cart cart;

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

}
