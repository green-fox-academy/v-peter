package com.greenfoxacademy.p2pchat.model;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String userName;
  private String text;

  public Message(String userName, String text) {
    this.userName = userName;
    this.text = text;
  }

  public Message() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
