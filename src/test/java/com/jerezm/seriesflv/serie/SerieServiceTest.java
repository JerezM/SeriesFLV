package com.jerezm.seriesflv.serie;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SerieServiceTest {
    
    @Mock
    private SerieRepository serieRepository;

    private SerieService serieServiceUnderTest;

    @BeforeEach
    void setUp() {
        this.serieServiceUnderTest = new SerieServiceImpl(this.serieRepository);
    }

    // ---- getAllSeries method test ----
    @Test
    void canGetStudents() {
        //when
        this.serieServiceUnderTest.getAllSeries();

        //then
        verify(this.serieRepository).findAll();
    }
}
