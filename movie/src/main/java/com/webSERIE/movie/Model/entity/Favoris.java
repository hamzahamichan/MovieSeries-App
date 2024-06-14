package com.webSERIE.movie.Model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Favoris {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "id_user", nullable = false)
        private User user;

        @ManyToOne
        @JoinColumn(name = "film_id")
        private Film film;

        @ManyToOne
        @JoinColumn(name = "id_serie")
        private Serie serie;

}
