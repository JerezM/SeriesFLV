package com.jerezm.seriesflv.serie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/series")
public class SerieController {

    private final SerieService serieService;
    
    @Autowired
    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping
    public ResponseEntity<List<Serie>> getAllSeries(){
        ResponseEntity<List<Serie>> responseEntity;

        List<Serie> serieList = this.serieService.getAllSeries();

        responseEntity = ResponseEntity.ok().body(serieList);

        return responseEntity;
    }
}
