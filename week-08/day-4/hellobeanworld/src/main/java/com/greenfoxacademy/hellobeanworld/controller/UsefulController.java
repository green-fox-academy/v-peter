package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulController {

  @Autowired
  private UtilityService service;


  @RequestMapping("/useful")
  public String index() {
    return "index";
  }

  @RequestMapping("/useful/colored")
  public String colored(Model model) {

    model.addAttribute("color", service.randomColor());
    return "color";
  }

  @RequestMapping("/useful/email")
  public String email() {
    return "index";
  }

  @RequestMapping("/useful/caesar")
  public String caesar() {
    return "index";
  }

}
