package com.greenfoxacademy.demo.controller;


import com.greenfoxacademy.demo.model.*;
import com.greenfoxacademy.demo.model.Error;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping(value = {"/", ""})
public class MainController {

  @GetMapping
  public String index() {
    return "index";
  }




}
