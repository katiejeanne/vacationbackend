package dev.katiejeanne.d288oa.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Entity
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    @JsonProperty("id")
    private Long divisionId;

    @Column(name = "division")
    @JsonProperty("division_name")
    @Setter
    private String name;

    @Column(name = "create_date")
    @JsonProperty("create_date")
    @CreationTimestamp
    private Date createDate;

    @Column(name = "last_update")
    @JsonProperty("last_update")
    @UpdateTimestamp
    private Date lastUpdate;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @JsonProperty("country")
    @Setter
    private Country country;
}
