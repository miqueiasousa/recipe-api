package com.example.recipeapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "ingredients")
public class Ingredient {
  @Id
  @GeneratedValue
  public int Id;

  @Column(name = "name")
  public String name;

  @Column(name = "quantity")
  public int quantity;

  @Column(name = "measure")
  public String measure;

  @ManyToOne
  @JoinColumn(name = "recipe_id")
  @JsonIgnoreProperties("ingredients")
  public Recipe recipe;

  public Ingredient() {
  }

  public Ingredient(int id, String name, int quantity, String measure, Recipe recipe) {
    Id = id;
    this.name = name;
    this.quantity = quantity;
    this.measure = measure;
    this.recipe = recipe;
  }

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
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

  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }
}
