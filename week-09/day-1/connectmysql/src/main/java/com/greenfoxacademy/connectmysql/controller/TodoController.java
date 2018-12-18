package com.greenfoxacademy.connectmysql.controller;

import com.greenfoxacademy.connectmysql.model.Todo;
import com.greenfoxacademy.connectmysql.repository.TodoRepository;
import com.greenfoxacademy.connectmysql.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
  public String list(@RequestParam(value = "active", required = false) boolean active, Model model) {
//    model.addAttribute("todos", service.listAll());
    if (active) model.addAttribute("todos", service.listActive());
    else model.addAttribute("todos", service.listAll());


//    model.addAttribute("todos", this.repo.findAll());

//    ArrayList<Todo> list = new ArrayList<>();
//    this.repo.findAll().forEach(list::add);
    return "todolist";
  }

//  @RequestMapping(value = "/notactive")
//  public String notActiveList(Model model) {
//    model.addAttribute("todos", service.listActive());
//
////    model.addAttribute("todos", this.repo.findAll());
//
////    ArrayList<Todo> list = new ArrayList<>();
////    this.repo.findAll().forEach(list::add);
//    return "todolist";
//  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable(name = "id") long id) {
    service.deleteTodo(service.getTodoById(id));
    return "redirect:/todo";
  }

  @GetMapping(value = "/add")
  public String add(Model model, @ModelAttribute Todo todo) {
    model.addAttribute("todo", todo);
    return "add";
  }

  @PostMapping(value = "/add")
  public String create(@ModelAttribute Todo todo){
    service.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping(value = "/{id}/edit")
  public String edit(Model model, @PathVariable(name = "id") long id) {
    model.addAttribute("todo", service.getTodoById(id));
    return "edit";
  }

  @PostMapping(value = "/edit")
  public String modify(@ModelAttribute Todo todo){
    service.addTodo(todo);
    return "redirect:/todo";
  }


}
