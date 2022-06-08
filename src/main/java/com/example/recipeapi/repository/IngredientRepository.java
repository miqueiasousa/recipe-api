package com.example.recipeapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.recipeapi.entity.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
  public List<Ingredient> findByRecipeId(int recipeId);
}
