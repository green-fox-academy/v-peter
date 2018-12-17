package com.greenfoxacademy.listingtodos;

import com.greenfoxacademy.listingtodos.model.Todo;
import com.greenfoxacademy.listingtodos.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosApplication implements CommandLineRunner {

  TodoRepository repo;

  @Autowired
  public void setRepo(TodoRepository repo){
    this.repo = repo;
  }

  public static void main(String[] args) {
    SpringApplication.run(ListingtodosApplication.class, args);
  }

  public void run(String... args){
repo.save(new Todo("I have to learn Object Relational Mapping"));
  }

}

