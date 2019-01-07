package com.greenfoxacademy.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/", ""})
public class MainController {

  @GetMapping
  public String index() {
    return "index";
  }

  @GetMapping("/doubling")
  @ResponseBody
  public Object doubling(@RequestParam(required = false) String input) {
    if (!input.equals(null)) {
      return new Resp(Integer.parseInt(input), Integer.parseInt(input) * 2);
    } else {
      return new Error("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  @ResponseBody
  public Object greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
    if (!name.equals(null) && !title.equals(null))
      return new Welcome("Oh, hi there " + name + ", my dear " + title + "!");
    else {
      return new Error("Please provide a name!");
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
