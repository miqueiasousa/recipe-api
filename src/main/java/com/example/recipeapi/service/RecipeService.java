package com.example.recipeapi.service;

import java.util.List;

import com.example.recipeapi.entity.Recipe;

public interface RecipeService {
  Recipe createRecipe(Recipe recipe);

  Recipe getRecipeById(int id);

  List<Recipe> getAllRecipes();
}
