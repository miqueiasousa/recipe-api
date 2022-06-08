package com.example.recipeapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.recipeapi.entity.Ingredient;
import com.example.recipeapi.exception.ingredient.IngredientNotFoundException;
import com.example.recipeapi.exception.recipe.RecipeNotFoundException;
import com.example.recipeapi.repository.IngredientRepository;
import com.example.recipeapi.repository.RecipeRepository;

@Service
public class IngredientServiceImpl implements IngredientService {
  @Autowired
  private IngredientRepository ingredientRepository;

  @Autowired
  private RecipeRepository recipeRepository;

  public Ingredient createIngredient(Ingredient ingredient) {
    return ingredientRepository.save(ingredient);
  }

  public List<Ingredient> getIngredientsByRecipeId(int recipeId) {
    var recipe = recipeRepository
        .findById(recipeId)
        .orElseThrow(() -> new RecipeNotFoundException(recipeId));

    return ingredientRepository.findByRecipeId(recipe.id);
  }

  public Ingredient getIngredientById(int id) {
    return ingredientRepository
        .findById(id)
        .orElseThrow(() -> new IngredientNotFoundException(id));
  }
}
