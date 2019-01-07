package com.greenfoxacademy.demo;


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

  @GetMapping("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return new Error("Please provide an input!");
    } else {
      return new Resp(input, input * 2);
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (name == null && title == null){
      return new Error("Please provide a name and a title!");
    }
    else if (name == null && title != null){
      return new Error("Please provide a name!");
    }
    else if (title == null && name != null){
      HashMap<String, String> error = new HashMap<>();
      error.put("error", "Please provide a title!");
      return error;
    }
    else {
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
    if (action.equals("sum")) return new Result(sum(json.getUntil()));
    else if (action.equals("factor")) return new Result(factor(json.getUntil()));
    else return new Error("Please provide a number!");
  }

  class Result {
    int result;
    public Result() {
    }
    public Result(int result) {
      this.result = result;
    }
    public int getResult() {
      return result;
    }
    public void setResult(int result) {
      this.result = result;
    }
  }

  public int sum(int a) {
    int sum = 0;
    for (int i = 1; i < a; i++) {
      sum += i;
    }
    return sum;
  }

  public int factor(int a) {
    int fact = 1;
    for (int i = 1; i < a; i++) {
      fact *= i;
    }
    return fact;
  }

  class Append {
    String appended;
    public Append(String appended) {
      this.appended = appended;
    }
    public Append() {
    }
    public String getAppended() {
      return appended;
    }
    public void setAppended(String appended) {
      this.appended = appended;
    }
  }

  class Welcome {
    String welcome_message;
    public Welcome() {
    }
    public Welcome(String welcome_message) {
      this.welcome_message = welcome_message;
    }
    public String getWelcome_message() {
      return welcome_message;
    }
    public void setWelcome_message(String welcome_message) {
      this.welcome_message = welcome_message;
    }
  }

  class Error {
    String error;
    public Error() {
    }
    public String getError() {
      return error;
    }
    public void setError(String error) {
      this.error = error;
    }
    public Error(String error) {
      this.error = error;
    }
  }

  class Resp {
    int received;
    int result;
    public Resp() {
    }
    public Resp(int received, int result) {
      this.received = received;
      this.result = result;
    }
    public int getReceived() {
      return received;
    }
    public void setReceived(int received) {
      this.received = received;
    }
    public int getResult() {
      return result;
    }
    public void setResult(int result) {
      this.result = result;
    }
  }

}
