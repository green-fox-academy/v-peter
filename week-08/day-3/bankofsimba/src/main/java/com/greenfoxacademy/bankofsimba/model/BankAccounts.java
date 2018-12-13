package com.greenfoxacademy.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
  private List<BankAccount> bankAccounts = new ArrayList<>();

  public BankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }
}
