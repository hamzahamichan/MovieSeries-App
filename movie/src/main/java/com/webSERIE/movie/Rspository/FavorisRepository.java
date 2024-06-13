package com.webSERIE.movie.Rspository;

import com.webSERIE.movie.Model.entity.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavorisRepository extends JpaRepository <Favoris, Integer> {

}
