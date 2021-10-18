package com.jerezm.seriesflv.serie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
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

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");

        List<Serie> seriesList = this.serieService.getAllSeries();

        responseEntity = new ResponseEntity<List<Serie>>(seriesList, headers, HttpStatus.OK);

        return responseEntity;
    }

}
