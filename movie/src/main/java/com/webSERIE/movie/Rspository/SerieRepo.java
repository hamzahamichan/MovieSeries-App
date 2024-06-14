package com.webSERIE.movie.Rspository;

import com.webSERIE.movie.Model.entity.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerieRepo extends JpaRepository <Serie , Integer> {
}
