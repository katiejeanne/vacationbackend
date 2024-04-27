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
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @JsonProperty("id")
    @Getter
    private Long customerId;

    @Column(name = "customer_first_name")
    @JsonProperty("firstName")
    @Getter
    @Setter
    private String firstName;

    @Column(name = "customer_last_name")
    @JsonProperty("lastName")
    @Getter
    @Setter
    private String lastName;

    @Column(name = "address")
    @JsonProperty("address")
    @Getter
    @Setter
    private String address;

    @Column(name = "postal_code")
    @JsonProperty("postal_code")
    @Getter
    @Setter
    private String postalCode;

    @Column(name = "phone")
    @JsonProperty("phone")
    @Getter
    @Setter
    private String phone;

    @Column(name = "create_date")
    @JsonProperty("create_date")
    @CreationTimestamp
    @Getter
    private Date createDate;

    @Column(name = "last_update")
    @JsonProperty("last_update")
    @UpdateTimestamp
    @Getter
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "division")
    @JsonProperty("division")
    @Getter
    @Setter
    private Division division;

    @OneToMany(mappedBy = "customer")
    @Getter
    @Setter
    private Set<Cart> carts;


}
