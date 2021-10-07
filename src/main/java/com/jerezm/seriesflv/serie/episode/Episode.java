package com.jerezm.seriesflv.serie.episode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Episode")
@Table(name = "episode")
public class Episode {
    
    @Id
    @SequenceGenerator(
        name = "episode_sequence",
        sequenceName = "episode_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "episode_sequence"
    )
    @Column(
        name = "episode_id"
    )
    @Getter
    @Setter
    private Integer id;

    @Column(
            name = "episode_number",
            nullable = false
    )
    @Getter
    @Setter
    private Integer episodeNumber;

    @Column(
            name = "episode_source_url",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @Getter
    @Setter
    private String episodeSourceUrl;

    public Episode(Integer id, Integer episodeNumber, String episodeSourceUrl) {
        this.id = id;
        this.episodeNumber = episodeNumber;
        this.episodeSourceUrl = episodeSourceUrl;
    }

    public Episode() {}

    @Override
    public String toString() {
        return "{ " + 
            "id='" + id + "'" +
            ", episodeNumber='" + episodeNumber + "'" +
            ", episodeSourceUrl='" + episodeSourceUrl + "'" + 
            "}";
    }
    
}
