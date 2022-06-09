package com.example.recipeapi.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "recipes")
public class Recipe {
  @Id
  @GeneratedValue
  public int id;

  @Column(name = "name")
  public String name;

  @Column(name = "description")
  public String description;

  @Column(name = "image_url")
  public String imageUrl;

  @Column(name = "prep_time")
  public int prepTime;

  @Column(name = "servings")
  public int servings;

  @OneToMany(mappedBy = "recipe")
  @JsonIgnoreProperties("recipe")
  public List<Ingredient> ingredients;

  public Recipe() {
  }

  public Recipe(int id, String name, String description, String imageUrl, int prepTime, int servings) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.imageUrl = imageUrl;
    this.prepTime = prepTime;
    this.servings = servings;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
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
