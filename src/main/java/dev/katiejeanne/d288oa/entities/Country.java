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
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    @JsonProperty("id")
    @Getter
    private Long countryId;

    @Column(name = "country_name")
    @JsonProperty("country_name")
    @Getter
    @Setter
    private String name;

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

    @OneToMany(mappedBy = "country")
    @Getter
    @Setter
    private Set<Division> divisions;
}
