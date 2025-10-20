package com.movie.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(schema = "movie", name = "city")
public class City {

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;

    private String city;

    @ManyToOne
    @JoinColumn(name="country_id")
    private Country country;

    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpdate;
}
