package com.example.recipeapi.advice.ingredient;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.recipeapi.advice.ErrorMessage;
import com.example.recipeapi.exception.ingredient.IngredientNotFoundException;

@ControllerAdvice
public class IngredientNotFoundAdvice {
  @ExceptionHandler(IngredientNotFoundException.class)
  @ResponseBody
  @ResponseStatus(code = HttpStatus.NOT_FOUND)
  public ErrorMessage ingredientNotFoundHandler(IngredientNotFoundException ex) {
    return new ErrorMessage(HttpStatus.NOT_FOUND.value(), ex.getMessage());
  }
}
