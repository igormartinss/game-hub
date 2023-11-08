package com.ms.gamehub.game;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String description;
    @NotNull
    private LocalDate releaseDate;
    @NotNull
    private Long timeToBeat;
    @NotNull
    private String company;
    @NotNull
    private Integer rating;
    @NotNull
    private String platform;
    @NotNull
    private String categories;

    public Game(String name, String description, LocalDate releaseDate, Long timeToBeat, String company, Integer rating, String platform, String categories) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.timeToBeat = timeToBeat;
        this.company = company;
        this.rating = rating;
        this.platform = platform;
        this.categories = categories;
    }

    public Game() {

    }

    public static Game fromRequest(GameRequest gameRequest) {
        return new Game(gameRequest.getName(), gameRequest.getDescription(), gameRequest.getReleaseDate(), gameRequest.getTimeToBeat(), gameRequest.getCompany(), gameRequest.getRating(), gameRequest.getPlatform(), gameRequest.getCategories());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Long getTimeToBeat() {
        return timeToBeat;
    }

    public String getCompany() {
        return company;
    }

    public Integer getRating() {
        return rating;
    }

    public String getPlatform() {
        return platform;
    }

    public String getCategories() {
        return categories;
    }
}
