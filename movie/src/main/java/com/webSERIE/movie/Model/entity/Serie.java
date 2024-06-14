package com.webSERIE.movie.Model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Setter
@Entity
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_serie;
    private String titre;
    private Date dateDebut;
    private Date dateFin;
    private String genre;
    private String createur;
    private double note;
}
