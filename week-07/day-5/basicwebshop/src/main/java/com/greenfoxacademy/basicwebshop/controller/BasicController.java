package com.greenfoxacademy.basicwebshop.controller;

import com.greenfoxacademy.basicwebshop.model.Items;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.stream.Collectors;

@Controller
public class BasicController {
  Items items;

  public BasicController() {
    items = new Items();
    items.addItem("Running shoes", "Nike running shoes for every day sport",
        1000.0, 5);
    items.addItem("Printer", "Some HP printer that will print pages",
        3000.0, 2);
    items.addItem("Coca cola", "0,5 l standard coke",
        25.0, 0);
  }

  @RequestMapping ("/")
  public String fullList(Model model) {
    model.addAttribute("list", items.getItemList());
    return "index";
  }

  @RequestMapping ("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("list", items.getItemList()
        .stream()
        .filter(product -> product.getQuantity() == 0)
        .collect(Collectors.toList()));
    return "index";
  }

  @RequestMapping ("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("list", items.cheapestFirst());
    return "index";
  }

}
