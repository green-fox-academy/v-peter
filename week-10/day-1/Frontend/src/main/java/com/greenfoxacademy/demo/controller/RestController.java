package com.greenfoxacademy.demo.controller;


import com.greenfoxacademy.demo.model.*;
import com.greenfoxacademy.demo.model.Error;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @GetMapping("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new com.greenfoxacademy.demo.model.Error("Please provide an input!");
    } else {
      return new Resp(input, input * 2);
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return new com.greenfoxacademy.demo.model.Error("Please provide a name and a title!");
    } else if (name == null) {
      return new com.greenfoxacademy.demo.model.Error("Please provide a name!");
    } else if (title == null) {
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a title!");
      return error;
    } else {
      return new Welcome("Oh, hi there " + name + ", my dear " + title + "!");
    }
  }

  @GetMapping("/appenda/{appendable}")
  @ResponseBody
  public Object appenda(@PathVariable String appendable, HttpServletResponse httpServletResponse) throws IOException {
    if (!appendable.equals(null))
      return new Append(appendable + "a");
    else {
      httpServletResponse.sendError(HttpServletResponse.SC_NOT_FOUND);
      return null;
    }
  }

  @PostMapping("/dountil/{action}")
  @ResponseBody
  public Object doUntil(@PathVariable String action, @RequestBody Until json) {
    Result result = new Result();
    HashMap<String, Integer> map = new HashMap<>();
    if (json == null) return new Error("Please provide a number!");
    else if (action.equals("sum")) {
      map.put("result", result.sum(json));
      return map;
    } else if (action.equals("factor")) {
      map.put("result", result.factor(json));
      return map;
    } else return null;
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody JasonObject json) {
    Result res = new Result();
    if (json.getWhat() == null || json.getNumbers() == null) return new Error("Please provide an array or action!");
    else if (json.getWhat().equals("sum")) {
      res.sum(json);
      return res;
    } else if (json.getWhat().equals("multiply")) {
      res.multiply(json);
      return res;
    } else if (json.getWhat().equals("double")) {
      HashMap<String, Integer[]> map = new HashMap<>();
      map.put("result", res.doubler(json));
      return map;
    }
    return new Error("Invalid data");
  }

}
