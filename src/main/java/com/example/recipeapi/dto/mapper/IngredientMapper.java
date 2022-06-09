package com.example.recipeapi.dto.mapper;

import com.example.recipeapi.dto.IngredientDto;
import com.example.recipeapi.entity.Ingredient;

public class IngredientMapper {
  public static Ingredient toIngredient(IngredientDto ingredientDto) {
    var ingredient = new Ingredient();

    ingredient.setName(ingredientDto.getName());
    ingredient.setQuantity(ingredientDto.getQuantity());
    ingredient.setMeasure(ingredientDto.getMeasure());

    return ingredient;
  }
}
