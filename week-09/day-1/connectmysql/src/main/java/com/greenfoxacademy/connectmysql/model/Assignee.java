package com.greenfoxacademy.connectmysql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;
  String email;
  String name;


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
}
