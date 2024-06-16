package com.webSERIE.movie.Controller;

import com.webSERIE.movie.Service.Favorisservice;
import com.webSERIE.movie.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Add_favoris_film")
public class ControllerFavoris {

    @Autowired
    private Favorisservice favorisservice;
    @Autowired
    private FilmService filmService;

    @PostMapping("/add-film")
    public void addFilmToFavori(@RequestParam int userId,@RequestParam int filmId ) {
        favorisservice.addfilmTofavoris(userId, filmId);
    }
}
