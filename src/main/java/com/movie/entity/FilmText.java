package com.movie.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "film_text")
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;


    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;

    @Column(name = "description", columnDefinition = "text")
    @Type(type = "text")
    private String description;

}
