package com.greenfoxacademy.demo.model;

public class JasonObject {
  String what;
  int[] numbers;

  public JasonObject() {
  }

  public JasonObject(String what, int[] array) {
    this.what = what;
    this.numbers = array;
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }
}
