package com.ms.gamehub.category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

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
