package com.webSERIE.movie.Controller;

import com.webSERIE.movie.Model.entity.DTO.SerieDto;
import com.webSERIE.movie.Model.entity.Film;
import com.webSERIE.movie.Model.entity.Serie;
import com.webSERIE.movie.Service.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Serie")
public class ControllerSerie {

     @Autowired
    private SerieService serieService;
    @GetMapping("/get_serie")
     public SerieDto getSerie(@RequestParam int id_serie){
         return serieService.getSerie(id_serie);
     }

    @GetMapping("/GET_All_serie")
    public List<Serie> getALL(){
        return serieService.getAll();
    }
}
