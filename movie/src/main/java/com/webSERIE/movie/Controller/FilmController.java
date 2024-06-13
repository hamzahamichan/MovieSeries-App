package com.webSERIE.movie.Controller;


import com.webSERIE.movie.Model.entity.DTO.FilmDto;
import com.webSERIE.movie.Model.entity.Film;
import com.webSERIE.movie.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/GET_film")
    public FilmDto getfilm(@RequestParam int id){
       return filmService.getFilm(id);
    }



    @GetMapping("/GET_All")
    public List<Film>getALL(){
        return filmService.getAll();
    }
}
