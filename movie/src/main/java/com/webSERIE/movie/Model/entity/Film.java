package com.webSERIE.movie.Model.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name ="hamza")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id")
    private int id;
    @Column(name ="titre")
    private String titres;
    @Column(name ="date_publication")
    private Date  dates;
    @Column(name ="genre")
    private String genre;
    @Column(name ="acteur")
    private String réalisateurs;
    @Column(name ="notes")
    private String notes;


}
