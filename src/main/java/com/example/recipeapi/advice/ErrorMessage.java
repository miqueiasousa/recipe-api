package com.example.recipeapi.advice;

public class ErrorMessage {
  public int errorCode;
  public String message;

  public ErrorMessage(int errorCode, String message) {
    this.errorCode = errorCode;
    this.message = message;
  }
}
