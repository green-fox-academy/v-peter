package com.greenfoxacademy.connectmysql.controller;

import com.greenfoxacademy.connectmysql.repository.TodoRepository;
import com.greenfoxacademy.connectmysql.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  Service service;

  @Autowired
  public void setRepo(Service service) {
    this.service = service;
  }


//  @RequestMapping(value={"","/list"})
//  @ResponseBody
//  public String list() {
//    return "This is my first Todo";
//  }

  @RequestMapping(value = {"", "/list"})
  public String list(@RequestParam(value="active", required = false) String active, Model model) {
    model.addAttribute("todos", service.listAll());

//    model.addAttribute("todos", this.repo.findAll());

//    ArrayList<Todo> list = new ArrayList<>();
//    this.repo.findAll().forEach(list::add);
    return "todolist";
  }

  @RequestMapping(value = "/notactive")
  public String notActiveList(Model model) {
    model.addAttribute("todos", service.listActive());

//    model.addAttribute("todos", this.repo.findAll());

//    ArrayList<Todo> list = new ArrayList<>();
//    this.repo.findAll().forEach(list::add);
    return "todolist";
  }

}
