package com.greenfoxacademy.p2pchat;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import java.util.Map;

@SpringBootApplication
@EnableGlobalMethodSecurity(securedEnabled = true)
public class P2pchatApplication
//extends CommandLineRunner
{

  public static void main(String[] args) {
//    System.out.println("*****"+dbName+"*****");
//    printEnvVar();
    SpringApplication.run(P2pchatApplication.class, args);

  }

//  @Value(value= "${spring.datasource.url}")
//  static String dbName;

  public static void printEnvVar() {
    Map<String, String> env = System.getenv();
    for (String envName : env.keySet()) {
      System.out.format("%s=%s%n",
          envName,
          env.get(envName));

    }
  }

//  @Override
//  public void run(String... arg0) throws Exception {
//    System.out.println("*****"+dbName+"*****");
//    printEnvVar();
//  }
}

