package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {

  private Animal animal;
  private int balance;



  public BankAccount(Animal animal, int balance) {
    this.animal = animal;
    this.balance = balance;
  }


  public Animal getAnimal() {
    return animal;
  }

  public int getBalance() {
    return balance;
  }
}
