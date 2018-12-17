package com.greenfoxacademy.connectmysql.model;


import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String title;
  boolean urgent;
  boolean done;

  public Todo() {
  }

  public Todo(String title) {
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Todo(String title, boolean urgent, boolean done) {
    this.title = title;
    this.urgent = urgent;
    this.done = done;
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public boolean isDone() {
    return done;
  }
}
