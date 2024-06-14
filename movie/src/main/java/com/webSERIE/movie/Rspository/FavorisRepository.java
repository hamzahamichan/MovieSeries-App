package com.webSERIE.movie.Rspository;

import com.webSERIE.movie.Model.entity.Favoris;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavorisRepository extends JpaRepository <Favoris, Integer> {

}
