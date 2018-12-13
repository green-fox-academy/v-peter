package com.greenfoxacademy.hellobeanworld.controller;

import com.greenfoxacademy.hellobeanworld.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
  public String email(Model model) {
    return "email";
  }

//  @RequestMapping("/useful/validator")
//  public String validator(Model model, @RequestParam String email) {
//    if (email.contains("@") && email.contains(".")) {
//      model.addAttribute("message", email + " is a valid email address");
//      model.addAttribute("color", "green");
//    } else{
//      model.addAttribute("message", email + " is not a valid email address");
//      model.addAttribute("color", "red");
//    }
//      return "email";
//  }

  @RequestMapping("/useful/validator")
  public String validator(Model model, @RequestParam String email) {
    service.setMessage(email);
    model.addAttribute("message", service.getMessage().getText());
    model.addAttribute("color", service.getMessage().getColor());
    return "email";
  }

  @RequestMapping("/useful/caesar")
  public String caesar() {
    return "index";
  }

}
