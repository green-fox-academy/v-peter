package com.greenfoxacademy.bankofsimba.model;

public class Animal {
  private String name;
  private String animalType;
  private boolean king;
  private String goodOrBad;


  public Animal(String name, String animalType, boolean king, String goodOrBad) {
    this.name = name;
    this.animalType = animalType;
    this.king = king;
    this.goodOrBad = goodOrBad;
  }


  public String getName() {
    return name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean isKing() {
    return king;
  }

  public String getGoodOrBad() {
    return goodOrBad;
  }
}
