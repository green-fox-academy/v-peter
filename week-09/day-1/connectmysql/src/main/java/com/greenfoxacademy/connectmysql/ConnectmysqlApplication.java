package com.greenfoxacademy.connectmysql;

import com.greenfoxacademy.connectmysql.model.Todo;
import com.greenfoxacademy.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectmysqlApplication implements CommandLineRunner {

  TodoRepository repo;

  @Autowired
  public void setRepo(TodoRepository repo) {
    this.repo = repo;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectmysqlApplication.class, args);
  }

  public void run(String... args) {
//    repo.save(new Todo("I have to learn Object Relational Mapping"));
//repo.save(new Todo("having lunch"));
//    repo.save(new Todo("anything" ));
    repo.findByDone(false).forEach(System.out::println);
    repo.findByDone(false).forEach(name -> {
      System.out.println(name.getTitle());
    });

  }
}
