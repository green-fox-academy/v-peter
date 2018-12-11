package com.greenfoxacademy.springstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

  AtomicLong al = new AtomicLong();
  @RequestMapping ("greeting.html")
  public Object greeting(String name) {
    Greeting greeting = new Greeting(al.getAndIncrement(), name);
    return greeting;
  }
}
