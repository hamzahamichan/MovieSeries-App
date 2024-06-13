package com.webSERIE.movie.Model.entity.DTO;


import com.webSERIE.movie.Model.entity.Film;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FilmDto {
    private int id;
    private String titres;
    private Date dates;
    private String genre;
    private String réalisateurs;
    private String notes;

    public static FilmDto toDto(Film entity){
              return FilmDto.builder()
                      .id(entity.getId())
                      .titres(entity.getTitres())
                      .dates(entity.getDates())
                      .genre(entity.getGenre())
                      .réalisateurs(entity.getRéalisateurs())
                      .notes(entity.getNotes())
                      .build();
    }
}
