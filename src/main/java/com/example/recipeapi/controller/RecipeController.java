package com.example.recipeapi.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.recipeapi.dto.IngredientDto;
import com.example.recipeapi.dto.RecipeDto;
import com.example.recipeapi.dto.mapper.IngredientMapper;
import com.example.recipeapi.entity.Ingredient;
import com.example.recipeapi.entity.Recipe;
import com.example.recipeapi.service.IngredientService;
import com.example.recipeapi.service.RecipeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class RecipeController {
  @Autowired
  private RecipeService recipeService;

  @Autowired
  private IngredientService ingredientService;

  @PostMapping("/recipes")
  public Recipe createRecipe(@RequestBody RecipeDto recipeDto) {
    var recipe = new Recipe();

    BeanUtils.copyProperties(recipeDto, recipe);

    return recipeService.createRecipe(recipe);
  }

  @GetMapping("/recipes")
  public List<Recipe> getAllRecipes() {
    return recipeService.getAllRecipes();
  }

  @GetMapping("/recipes/{id}")
  public Recipe getRecipeById(@PathVariable int id) {
    return recipeService.getRecipeById(id);
  }

  @PostMapping("/recipes/{recipeId}/ingredients")
  public Ingredient createIngredient(@PathVariable int recipeId, @RequestBody IngredientDto ingredientDto) {
    var recipe = recipeService.getRecipeById(recipeId);

    var ingredient = IngredientMapper.toIngredient(ingredientDto);

    ingredient.setRecipe(recipe);

    return ingredientService.createIngredient(ingredient);
  }

  @GetMapping("/recipes/{recipeId}/ingredients")
  public List<Ingredient> getIngredientsByRecipeId(@PathVariable int recipeId) {
    return ingredientService.getIngredientsByRecipeId(recipeId);
  }
}
