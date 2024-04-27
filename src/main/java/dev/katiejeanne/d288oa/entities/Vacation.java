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
public class Vacation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    @JsonProperty("id")
    @Getter
    private Long vacationId;

    @Column(name = "vacation_title")
    @JsonProperty("vacation_title")
    @Getter
    @Setter
    private String title;

    @Column(name = "description")
    @JsonProperty("description")
    @Getter
    @Setter
    private String description;

    @Column(name = "travel_fare_price")
    @JsonProperty("travel_price")
    @Getter
    @Setter
    private BigDecimal travelPrice;

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
}
