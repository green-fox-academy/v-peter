package com.greenfoxacademy.demo.model;

public class Result {
  int result;

  public Result() {
  }

  public Result(int result) {
    this.result = result;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

  public int sum(Until u) {
    int sum = 0;
    for (int i = 1; i <= u.getUntil(); i++) {
      sum += i;
    }
    return sum;
  }

  public int factor(Until u) {
    int fact = 1;
    for (int i = 1; i <= u.getUntil(); i++) {
      fact *= i;
    }
    return fact;
  }
}
