package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("RedColor")
public class RedColor implements MyColor {
  String color = "\033[31m";
  @Override
  public void printColor() {
    System.out.println(color+"Hello");
  }
}
