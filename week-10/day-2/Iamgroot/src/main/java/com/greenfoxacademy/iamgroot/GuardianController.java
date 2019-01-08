package com.greenfoxacademy.iamgroot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class GuardianController {

@GetMapping("/groot")
  public ResponseEntity groot (@RequestParam(required = false) String message ){
  HashMap<String, String> map = new HashMap<>();
  if (message == null) {
    return new ResponseEntity(new Error("I am Groot!"), HttpStatus.BAD_REQUEST);
  }
  return  new ResponseEntity(new Message(message, "I am Groot!"),HttpStatus.OK);
}


}
