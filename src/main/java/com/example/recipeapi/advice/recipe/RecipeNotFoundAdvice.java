package com.example.recipeapi.advice.recipe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.recipeapi.advice.ErrorMessage;
import com.example.recipeapi.exception.recipe.RecipeNotFoundException;

@ControllerAdvice
public class RecipeNotFoundAdvice {
  @ExceptionHandler(RecipeNotFoundException.class)
  @ResponseBody
  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  public ErrorMessage recipeNotFoundHandler(RecipeNotFoundException ex) {
    return new ErrorMessage(HttpStatus.NOT_FOUND.value(), ex.getMessage());
  }
}
