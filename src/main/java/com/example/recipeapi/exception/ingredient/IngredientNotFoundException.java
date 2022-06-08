package com.example.recipeapi.exception.ingredient;

public class IngredientNotFoundException extends RuntimeException {
  public IngredientNotFoundException(int id) {
    super(String.format("Ingredient with id %d not found", id));
  }
}
