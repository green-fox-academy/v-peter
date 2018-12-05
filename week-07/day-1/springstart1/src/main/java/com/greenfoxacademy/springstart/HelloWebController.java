package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong al = new AtomicLong();


  @RequestMapping ("/web/greeting")
  public String greeting(Model model, String name) {
    Greeting greeting = new Greeting(al.getAndIncrement(), name);
    model.addAttribute("name", greeting.getContent());
    model.addAttribute("count", greeting.getId());
    model.addAttribute("hello", greeting.hello);
    int red = (int) (Math.random() * 256);
    int green = (int) (Math.random() * 256);
    int blue = (int) (Math.random() * 256);
    model.addAttribute("red", red);
    model.addAttribute("green", green);
    model.addAttribute("blue", blue);
   return "greeting";
  }
}
