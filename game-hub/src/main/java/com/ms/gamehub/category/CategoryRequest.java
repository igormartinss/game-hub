package com.ms.gamehub.category;

import javax.validation.constraints.NotBlank;

public class CategoryRequest {
    @NotBlank
    private final String name;
    @NotBlank
    private final String description;

    public CategoryRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
