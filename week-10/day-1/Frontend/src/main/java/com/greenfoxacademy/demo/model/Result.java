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

  public void sum(JasonObject j) {
   int sum = 0;
    for (int i:
         j.numbers) {
      sum += i;
    }
    this.result = sum;
  }

  public void multiply(JasonObject j) {
    int mult = 1;
    for (int i:
        j.numbers) {
      mult *= i;
    }
    this.result = mult;
  }

  public Integer[] doubler(JasonObject j) {
   Integer[] newArray = new Integer [j.numbers.length];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = j.numbers[i] * 2;
    }
   return newArray;
  }
}
