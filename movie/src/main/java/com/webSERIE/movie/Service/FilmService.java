package com.webSERIE.movie.Service;


import com.webSERIE.movie.Model.entity.DTO.FilmDto;
import com.webSERIE.movie.Model.entity.Film;
import com.webSERIE.movie.Rspository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilmService {

    @Autowired
    private FilmRepo filmRepo;

    public FilmDto getFilm(int id) {
        Optional<Film> film = this.filmRepo.findById(id);
        if (film.isPresent())
        return FilmDto.toDto(film.get());
        else
            return null;
    }
    //public Film save(Film film1){
     //  return this.filmRepo.save(film1);
    //}
    public List<Film> getAll(){
        return this.filmRepo.findAll();
    }


}
