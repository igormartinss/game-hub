package com.ms.gamehub.game;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class GameRequest {

    @NotBlank
    private final String name;

    @NotBlank
    private final String description;

    @NotNull
    private final LocalDate releaseDate;

    private final Long timeToBeat;

    @NotBlank
    private final String company;

    @NotNull
    @Min(1)
    @Max(10)
    private final Integer rating;

    @NotBlank
    private final String platform;

    @NotBlank
    private final String categories;

    public GameRequest(String name, String description, LocalDate releaseDate, Long timeToBeat, String company, Integer rating, String platform, String categories) {
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
        this.timeToBeat = timeToBeat;
        this.company = company;
        this.rating = rating;
        this.platform = platform;
        this.categories = categories;
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
