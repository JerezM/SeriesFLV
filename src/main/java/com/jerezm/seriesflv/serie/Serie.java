package com.jerezm.seriesflv.serie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.jerezm.seriesflv.serie.episode.Episode;

@Entity(name = "Serie")
@Table(name = "serie")
public class Serie {
    
    @Id
    @SequenceGenerator(
        name = "serie_sequence",
        sequenceName = "serie_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "serie_sequence"
    )
    @Column(
        name = "serie_id"
    )
    private Integer id;

    @Column(
            name = "serie_name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String serieName;

    @Column(
            name = "serie_description",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String serieDescription;

    @Column(
            name = "image_url",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String imageUrl;

    //uni-directional one-to-may association with Episode
    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    @JoinColumn(
        name = "serie_id",
        nullable = false
    )
    private List<Episode> episodes = new ArrayList<Episode>();

    public Serie(Integer id, String serieName, String serieDescription, String imageUrl) {
        this.id = id;
        this.serieName = serieName;
        this.serieDescription = serieDescription;
        this.imageUrl = imageUrl;
    }

    public Serie() {}

    /**
     * Get a colletion with all the episodes that contain this serie.
     * @return a colletion of episodes.
     */
    public List<Episode> getEpisodes(){
        return this.episodes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerieName() {
        return serieName;
    }

    public void setSerieName(String serieName) {
        this.serieName = serieName;
    }

    public String getSerieDescription() {
        return serieDescription;
    }

    public void setSerieDescription(String serieDescription) {
        this.serieDescription = serieDescription;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    @Override
    public String toString() {
        return "{ " + 
            "id='" + id + "'" +
            ", serieName='" + serieName + "'" +
            ", serieDescription='" + serieDescription + "'" +
            ", imageUrl='" + imageUrl + "'" +
            "}";
    }
}
