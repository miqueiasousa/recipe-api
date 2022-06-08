package com.example.recipeapi.exception.recipe;

public class RecipeNotFoundException extends RuntimeException {
  public RecipeNotFoundException(int id) {
    super(String.format("Recipe with id %d not found", id));
  }
}
