package com.ms.gamehub.category;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Deprecated
    public Category() { }

    public static Category fromRequest(CategoryRequest categoryRequest) {
        return new Category(categoryRequest.getName(), categoryRequest.getDescription());
    }

    public Long getId() { return id; }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
