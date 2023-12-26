package com.ms.gamehub.game;

import java.time.LocalDate;

public class GameResponse {

    private final String name;

    private final String description;

    private final LocalDate releaseDate;

    private final Long timeToBeat;

    private final String company;

    private final Integer rating;

    private final String platform;

    private final String categories;

    public GameResponse(String name, String description, LocalDate releaseDate, Long timeToBeat, String company, Integer rating, String platform, String categories) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.timeToBeat = timeToBeat;
        this.company = company;
        this.rating = rating;
        this.platform = platform;
        this.categories = categories;
    }

    public static GameResponse fromEntity(Game game) {
        return new GameResponse(game.getName(), game.getDescription(), game.getReleaseDate(), game.getTimeToBeat(), game.getCompany(), game.getRating(), game.getPlatform(), game.getCategories());
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

