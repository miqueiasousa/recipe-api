package com.example.recipeapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recipeapi.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
