package com.example.recipeapi.dto;

public class IngredientDto {
  public String name;
  public int quantity;
  public String measure;

  public IngredientDto(String name, int quantity, String measure) {
    this.name = name;
    this.quantity = quantity;
    this.measure = measure;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getMeasure() {
    return measure;
  }

  public void setMeasure(String measure) {
    this.measure = measure;
  }
}
