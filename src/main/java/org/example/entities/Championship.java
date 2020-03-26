package org.example.entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "championship")
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "championship_name")
    private String championshipName;

    @OneToMany
    private List<Country>countries;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sport_type",referencedColumnName = "id")
    private SportType sportType;

    public Championship(String championshipName, List<Country> countries, SportType sportType) {
        this.championshipName = championshipName;
        this.countries = countries;
        this.sportType = sportType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChampionshipName() {
        return championshipName;
    }

    public void setChampionshipName(String championshipName) {
        this.championshipName = championshipName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public SportType getSportType() {
        return sportType;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }
}
