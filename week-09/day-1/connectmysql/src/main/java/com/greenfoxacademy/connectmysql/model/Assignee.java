package com.greenfoxacademy.connectmysql.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String email;
  String name;

  @OneToMany(mappedBy = "assignee")
  List<Todo> todos;


  public Assignee(String email, String name) {
    this.email = email;
    this.name = name;
  }

  public Assignee() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
