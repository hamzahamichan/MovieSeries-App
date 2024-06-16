package com.webSERIE.movie.Service;


import com.webSERIE.movie.Model.entity.Favoris;
import com.webSERIE.movie.Model.entity.Film;
import com.webSERIE.movie.Model.entity.User;
import com.webSERIE.movie.Rspository.FavorisRepository;
import com.webSERIE.movie.Rspository.FilmRepo;
import com.webSERIE.movie.Rspository.SerieRepo;
import com.webSERIE.movie.Rspository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
@Transactional
public class Favorisservice {
    @Autowired
    private FavorisRepository favoriRepository;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private FilmRepo filmRepo;

    @Autowired
    private SerieRepo serieRepo;

    @Autowired
    private FilmService filmService;

    @Autowired
    private SerieService serieService;

    public void  addfilmTofavoris(int userId , int filmId){
        User user = userRepo.findById(userId ).orElseThrow(() -> new ResourceNotFoundException("User not found"));
        Film film = filmRepo.findById(filmId).orElseThrow(() -> new ResourceNotFoundException("Film not found"));

        Favoris favoris = new Favoris();
        favoris.setUser(user);
        favoris.setFilm(film);
        favoriRepository.save(favoris);
    }


}
