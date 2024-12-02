package dev.katiejeanne.vacationbackend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Getter
@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    @JsonProperty("id")
    private Long customerId;

    @Column(name = "customer_first_name", nullable = false)
    @JsonProperty("firstName")
    @Setter
    private String firstName;

    @Column(name = "customer_last_name", nullable = false)
    @JsonProperty("lastName")
    @Setter
    private String lastName;

    @Column(name = "address", nullable = false)
    @JsonProperty("address")
    @Setter
    private String address;

    @Column(name = "postal_code", nullable = false)
    @JsonProperty("postal_code")
    @Setter
    private String postalCode;

    @Column(name = "phone", nullable = false)
    @JsonProperty("phone")
    @Setter
    private String phone;

    @Column(name = "create_date")
    @JsonProperty("create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "last_update")
    @JsonProperty("last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "division_id", nullable = false)
    @JsonProperty("division")
    @Setter
    private Division division;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @Setter
    private Set<Cart> carts;


}
