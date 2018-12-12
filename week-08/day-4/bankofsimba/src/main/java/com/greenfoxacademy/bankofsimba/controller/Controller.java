package com.greenfoxacademy.bankofsimba.controller;


import com.greenfoxacademy.bankofsimba.model.Animal;
import com.greenfoxacademy.bankofsimba.model.BankAccount;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  public Controller() {
    bankAccounts.add(new BankAccount(new Animal("Simba", "lion", true, "Good One"), 2000));
    bankAccounts.add(new BankAccount(new Animal("Pumba", "wild boar", false, "Good One"), 1000));
    bankAccounts.add(new BankAccount(new Animal("Scar", "lion", true, "Bad Guy"), 3000));
  }

  @RequestMapping("/show")
  public String show(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "index";
  }

  @RequestMapping("/text")
  public String text(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }

  @RequestMapping("/table")
  public String table(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "table";
  }

}
