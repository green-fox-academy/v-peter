package com.greenfoxacademy.connectmysql.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="todo")
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  @NotNull
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

  public Todo(long id, String title, boolean urgent, boolean done) {
    this.id = id;
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

  public void setId(long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
