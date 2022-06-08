package com.example.recipeapi.dto;

public class RecipeDto {
  public String name;
  public String description;
  public String imageUrl;
  public int prepTime;
  public int servings;

  public RecipeDto(String name, String description, String imageUrl, int prepTime, int servings) {
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.prepTime = prepTime;
    this.servings = servings;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public int getPrepTime() {
    return prepTime;
  }

  public void setPrepTime(int prepTime) {
    this.prepTime = prepTime;
  }

  public int getServings() {
    return servings;
  }

  public void setServings(int servings) {
    this.servings = servings;
  }
}
