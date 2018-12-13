package com.greenfoxacademy.hellobeanworld.service;

import com.greenfoxacademy.hellobeanworld.model.Message;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;
  Message message;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public Message getMessage() {
    return message;
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean checker(String email){
    if(email.contains("@") && email.contains(".")) return true;
    return false;
  }

  public void setMessage(String email){
    if (checker(email)) this.message = new Message(email+ " is a valid email address", "green");
    else this.message = new Message(email+ " is a valid email address", "green");
  }
}
