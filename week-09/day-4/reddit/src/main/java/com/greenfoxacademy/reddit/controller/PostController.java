package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/reddit")
public class PostController {

  private PostService service;

  @Autowired
  public void setService(PostService service) {
    this.service = service;
  }

  @RequestMapping(value = {"", "/postlist"})
  public String listAllPost(Model model, String ppp) {
//    model.addAttribute("posts", service.listAll());
    if (ppp == null) model.addAttribute("posts", service.listFirstTen());
    else model.addAttribute("posts", service.listOptionalNumber(Integer.parseInt(ppp)));

    return "postlist";
  }

  @GetMapping(value = "/add")
  public String addForm(Model model) {
    model.addAttribute("post", new Post());
    return "addpost";
  }

//  @PostMapping(value = "/add")
//  public String add(@ModelAttribute Post post){
//    System.out.println("vote "+post.getVote());
//    service.addPost(post);
//    return "redirect:/reddit";
//  }

  @PostMapping(value = "/add")
  public String add(@ModelAttribute Post post){
    service.addPost(post);
    return "redirect:/reddit";
  }

  @GetMapping(value="/{id}/incr")
  public String icreaseVote(@PathVariable long id){
    service.increaseVoteById(id);
    return "redirect:/reddit";
  }

  @GetMapping(value="/{id}/decr")
  public String dereaseVote(@PathVariable long id){
    service.decreaseVoteById(id);
    return "redirect:/reddit";
  }
//
//  @GetMapping(value="/login")
//  public String login(@ModelAttribute User user){
//
//    return "redirect:/reddit";
//  }

}
