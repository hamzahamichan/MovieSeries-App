package com.webSERIE.movie.Service;

import com.webSERIE.movie.Model.entity.DTO.FilmDto;
import com.webSERIE.movie.Model.entity.DTO.SerieDto;
import com.webSERIE.movie.Model.entity.Film;
import com.webSERIE.movie.Model.entity.Serie;
import com.webSERIE.movie.Rspository.SerieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieService {
    @Autowired
    private SerieRepo serieRepo;

    public SerieDto getSerie(int id_serie) {
        Optional<Serie> serie = this.serieRepo.findById(id_serie);
        if (serie.isPresent())
            return SerieDto.toDto(serie.get());
        else
            return null;
    }
    //public Film save(Film film1){
    //  return this.filmRepo.save(film1);
    //}
    public List<Serie> getAll(){
        return this.serieRepo.findAll();
    }
}
