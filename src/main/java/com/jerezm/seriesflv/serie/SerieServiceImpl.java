package com.jerezm.seriesflv.serie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SerieServiceImpl implements SerieService {

    private final SerieRepository serieRepository;

    @Autowired
    public SerieServiceImpl(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    @Override
    public List<Serie> getAllSeries() {
        List<Serie> seriesList = this.serieRepository.findAll();

        return seriesList;
    }
    
}
