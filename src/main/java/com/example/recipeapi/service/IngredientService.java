package com.example.recipeapi.service;

import java.util.List;

import com.example.recipeapi.entity.Ingredient;

public interface IngredientService {
  public Ingredient createIngredient(Ingredient ingredient);

  public Ingredient getIngredientById(int id);

  public List<Ingredient> getIngredientsByRecipeId(int recipeId);
}
