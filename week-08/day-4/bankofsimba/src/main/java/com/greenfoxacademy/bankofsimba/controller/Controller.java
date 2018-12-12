package com.greenfoxacademy.bankofsimba.controller;


import com.greenfoxacademy.bankofsimba.model.BankAccount;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

  private List<BankAccount> bankAccounts = new ArrayList<>();

  public Controller() {
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", true));
    bankAccounts.add(new BankAccount("Pumba", 1000, "wild boar", false));
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
