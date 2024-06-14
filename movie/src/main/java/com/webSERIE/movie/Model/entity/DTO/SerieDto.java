package com.webSERIE.movie.Model.entity.DTO;
import com.webSERIE.movie.Model.entity.Serie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SerieDto {

        private int id_serie;
        private String titre;
        private Date dateDebut;
        private Date dateFin;
        private String genre;
        private String createur;
        private double note;

        public static SerieDto toDto(Serie entity){
            return SerieDto.builder()
                    .id_serie(entity.getId_serie())
                    .titre(entity.getTitre())
                    .createur(entity.getCreateur())
                    .dateDebut(entity.getDateDebut())
                    .dateFin(entity.getDateFin())
                    .note(entity.getNote())
                    .genre(entity.getGenre())
                    .build();
        }

}
