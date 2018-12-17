package com.greenfoxacademy.listingtodos.controller;

import com.greenfoxacademy.listingtodos.model.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping(value="/todo")
public class TodoController {

  TodoRepository repo;

  @Autowired
  public void setRepo(TodoRepository repo){
    this.repo = repo;
  }


//  @RequestMapping(value={"","/list"})
//  @ResponseBody
//  public String list() {
//    return "This is my first Todo";
//  }

  @RequestMapping(value={"","/list"})
  public String list(Model model) {
    model.addAttribute("todos", this.repo.findAll());
//    ArrayList<Todo> list = new ArrayList<>();
//    this.repo.findAll().forEach(list::add);
    return "todolist";
  }

}
