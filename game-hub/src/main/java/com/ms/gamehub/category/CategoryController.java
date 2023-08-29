package com.ms.gamehub.category;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    private final CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostMapping("/categories")
    public void createCategory(@Valid @RequestBody CategoryRequest categoryRequest) {

        categoryRepository.save(Category.fromRequest(categoryRequest));
    }

    @GetMapping("/categories")
    public List<CategoryResponse> getCategories() {
        List<Category> categories =  categoryRepository.findAll();
        List<CategoryResponse> categoriesResponse = new ArrayList<>();

        for (Category category : categories) {
            categoriesResponse.add(CategoryResponse.fromEntity(category));
        }

        return categoriesResponse;
    }
}
