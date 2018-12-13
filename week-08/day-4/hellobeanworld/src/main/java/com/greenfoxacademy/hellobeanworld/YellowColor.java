package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("YellowColor")
public class YellowColor implements MyColor{
  String color = "\033[33m";
  @Override
  public void printColor() {
    System.out.println(color+"Hello");
  }
}
