package com.ms.gamehub.game;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record GameRequest(@NotBlank String name, @NotBlank String description, @NotNull LocalDate releaseDate,
                          Long timeToBeat, @NotBlank String company, @Min(1) @Max(10) @NotNull Integer rating,
                          @NotBlank String platform, @NotBlank String categories) {

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

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public LocalDate releaseDate() {
        return releaseDate;
    }

    @Override
    public String company() {
        return company;
    }

    @Override
    public Integer rating() {
        return rating;
    }

    @Override
    public String platform() {
        return platform;
    }

    @Override
    public String categories() {
        return categories;
    }
}
