package com.ms.gamehub.category;

public class CategoryResponse {
    private final Long id;
    private final String name;
    private final String description;

    public CategoryResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static CategoryResponse fromEntity(Category category) {
        return new CategoryResponse(category.getId(), category.getName(), category.getDescription());
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
}
