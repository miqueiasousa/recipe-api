package com.example.recipeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipeapi.entity.Recipe;
import com.example.recipeapi.exception.recipe.RecipeNotFoundException;
import com.example.recipeapi.repository.RecipeRepository;

@Service
public class RecipeServiceImpl implements RecipeService {
  @Autowired
  private RecipeRepository recipeRepository;

  public Recipe createRecipe(Recipe recipe) {
    return recipeRepository.save(recipe);
  }

  public List<Recipe> getAllRecipes() {
    return recipeRepository.findAll();
  }

  public Recipe getRecipeById(int id) {
    return recipeRepository
        .findById(id)
        .orElseThrow(() -> new RecipeNotFoundException(id));
  }
}
