package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("GreenColor")
public class GreenColor implements MyColor {
  String color = "\033[32m";
  @Override
  public void printColor() {
    System.out.println(color+"Hello");
  }
}
