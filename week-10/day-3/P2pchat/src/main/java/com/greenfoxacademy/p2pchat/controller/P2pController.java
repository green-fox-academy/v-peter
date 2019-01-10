package com.greenfoxacademy.p2pchat.controller;

import com.greenfoxacademy.p2pchat.model.Log;
import com.greenfoxacademy.p2pchat.model.Message;
import com.greenfoxacademy.p2pchat.model.User;
import com.greenfoxacademy.p2pchat.service.LogService;
import com.greenfoxacademy.p2pchat.service.MessageService;
import com.greenfoxacademy.p2pchat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class P2pController {

  LogService logService = new LogService();
  UserService userService = new UserService();
  MessageService messageService = new MessageService();

  @Autowired
  public void setLogService(LogService service) {
    this.logService = service;
  }

  @Autowired
  public void setUserService(UserService service) {
    this.userService = service;
  }

  @Autowired
  public void setMessageService(MessageService service) {
    this.messageService = service;
  }

  @GetMapping(value = {"", "/"})
  public Object index(Model model) {
    model.addAttribute("messages", messageService.getAllMessage());
    model.addAttribute("defaultmessage", messageService.getDefaultMessage());
    System.out.println(messageService.getDefaultMessage().getText());
    logService.log();
    return "index";
  }

  @GetMapping("/register")
  public String register() {
    logService.log();
    if(!this.userService.getAll().isEmpty()) return "redirect:/";
    else return "register";
  }

  @PostMapping("/register")
  public String register(@RequestParam(required = false) String username, Model model) {
    if (username.equals("")) {
      model.addAttribute("message", "The username field is empty");
      model.addAttribute("value", "Please enter an username!!!");
      return "register";
    } else {
      logService.log();
      userService.addUser(new User(username));
      return "redirect:/";
    }
  }

  @GetMapping("/deleteall")
  public String deleteAll() {
    this.messageService.deleteAll();
    return "redirect:/";
  }

  @PostMapping("/newmessage")
  public String newMessage(@RequestParam String comment) {
    this.messageService.addMessage(new Message(userService.getCurrentUser().getUserName(), comment));
    return "redirect:/";
  }

//  @PostMapping("/api/message/receive")
//  public String

}
