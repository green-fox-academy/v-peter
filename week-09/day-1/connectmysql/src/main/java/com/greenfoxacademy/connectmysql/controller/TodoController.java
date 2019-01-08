package com.greenfoxacademy.connectmysql.controller;

import com.greenfoxacademy.connectmysql.model.Todo;
import com.greenfoxacademy.connectmysql.service.AssigneeService;
import com.greenfoxacademy.connectmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/todo")
public class TodoController {

  TodoService todoService;
  AssigneeService assigneeService;

  @Autowired
  public void setTodoService(TodoService todoService) {
    this.todoService = todoService;
  }

  @Autowired
  public void setAssigneeService(AssigneeService assigneeService) {
    this.assigneeService = assigneeService;
  }

//  @RequestMapping(value={"","/list"})
//  @ResponseBody
//  public String list() {
//    return "This is my first Todo";
//  }

  @RequestMapping(value = {"", "/list"})
  public String list(@RequestParam(value = "active", required = false) boolean active, Model model) {
//    model.addAttribute("todos", service.listAll());
    if (active) model.addAttribute("todos", todoService.listActive());
    else model.addAttribute("todos", todoService.listAll());


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

//  @RequestMapping(value = "/{id}/delete")
//  public String delete(@PathVariable(name = "id") long id) {
//    todoService.deleteTodo(todoService.getTodoById(id));
//    return "redirect:/todo";
//  }

  @RequestMapping(value = "/delete")
  public String delete(@RequestParam long id) {
    todoService.deleteTodo(todoService.getTodoById(id));
    return "redirect:/todo";
  }

  @GetMapping(value = "/add")
  public String add(Model model, @ModelAttribute Todo todo) {
    model.addAttribute("todo", todo);
    model.addAttribute("assignees", this.assigneeService.listAll());
    return "todoadd";
  }

  @PostMapping(value = "/add")
  public String create(@ModelAttribute Todo todo){
    todoService.addTodo(todo);
    return "redirect:/todo";
  }

  @GetMapping(value = "/{id}/edit")
  public String edit(Model model, @PathVariable(name = "id") long id) {
    model.addAttribute("todo", todoService.getTodoById(id));
    model.addAttribute("assignees", assigneeService.listAll());
    return "todoedit";
  }

  @PostMapping(value = "/{id}/edit")
  public String modify(@ModelAttribute Todo editedTodo){
    todoService.addTodo(editedTodo);
    return "redirect:/todo";
  }

  @RequestMapping(value= "/search")
  public String search(Model model, String title){
    model.addAttribute("todos", todoService.getTodoByTitle(title));
    return "todolist";
  }




}
