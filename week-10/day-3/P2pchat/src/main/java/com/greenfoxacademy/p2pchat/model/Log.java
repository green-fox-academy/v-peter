package com.greenfoxacademy.p2pchat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String path;
  private String method;
  private Date date;
  private String level;
  private String data;
  private String message;

  public Log(String path, String method, String level, String data) {
    this.path = path;
    this.method = method;
    this.date = new Date();
    this.level = level;
    this.data = data;
    this.setMessage();
  }

  public Log() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage() {
    this.message = this.date + " " + this.level + " " + this.path + " " + this.method + " " + this.data;
  }
}
