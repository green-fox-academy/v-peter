package com.greenfoxacademy.connectmysql.controller;


import com.greenfoxacademy.connectmysql.model.Assignee;
import com.greenfoxacademy.connectmysql.service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/assignee")
public class AssigneeController {

  AssigneeService service;

  @Autowired
  public void setService(AssigneeService service) {
    this.service = service;
  }


  @RequestMapping(value = {"", "/list"})
  public String assigneelist(Model model) {
    model.addAttribute("assignees", service.listAll());
    return "assigneelist";
  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable long id) {
    service.delete(service.getAssigneeById(id));
    return "redirect:/assignee";
  }


  @RequestMapping(value = "/{id}/edit")
  public String edit(@PathVariable(name="id") long id, Model model) {
    model.addAttribute("assignee", service.getAssigneeById(id));
    return "assigneeedit";
  }

  @PostMapping(value = "/{id}/edit")
  public String modify(@ModelAttribute Assignee ass) {
    service.editAssignee(ass);
    return "redirect:/assignee";
  }

  @RequestMapping(value = "/add")
  public String add(Model model, @ModelAttribute Assignee ass) {
    model.addAttribute("assignee", ass);
    return "assigneeadd";
  }

  @PostMapping(value = "/add")
  public String create(@ModelAttribute Assignee ass){
    service.addAssignee(ass);
    return "redirect:/assignee";
  }

}
