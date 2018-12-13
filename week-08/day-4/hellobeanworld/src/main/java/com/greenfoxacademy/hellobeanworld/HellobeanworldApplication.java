package com.greenfoxacademy.hellobeanworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanworldApplication implements CommandLineRunner {

  private Printer printer;

  @Autowired
  @Qualifier("GreenColor")
  private MyColor color;

  public void SetColor(MyColor mycolor){
    this.color = mycolor;
  }



  @Autowired
  public void setPrinter(Printer printer) {
    this.printer = printer;
  }



  public static void main(String[] args) {
    SpringApplication.run(HellobeanworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    color.printColor();
  }
}

