package com.webSERIE.movie.Rspository;


import com.webSERIE.movie.Model.entity.Film;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepo extends JpaRepository <Film , Integer> {
}
