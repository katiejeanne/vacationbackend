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
@Table(name = "excursions")
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "excursion_id")
    @JsonProperty("id")
    @Getter
    private Long excursionId;

    @Column(name = "excursion_title")
    @JsonProperty("excursion_title")
    @Getter
    @Setter
    private String title;

    @Column(name = "image_url")
    @JsonProperty("image_URL")
    @Getter
    @Setter
    private String imageUrl;

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
    @JoinColumn(name = "vacation_id")
    @JsonProperty("vacation")
    @Getter
    @Setter
    private Vacation vacation;

    @ManyToMany
    @JoinTable(
            name = "excursion_cartitem",
            joinColumns = { @JoinColumn(name = "excursion_id") },
            inverseJoinColumns = { @JoinColumn(name = "cart_item_id") } )
    @JsonProperty("cartitems")
    @Getter
    @Setter
    private Set<CartItem> cartItems;

}
