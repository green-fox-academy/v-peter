package com.greenfoxacademy.demo.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  Date createdAt;
  String endpoint;
  String data;

  public Log(Date createdAt, String endpoint, String data) {
    this.createdAt = createdAt;
    this.endpoint = endpoint;
    this.data = data;
  }

  public Log() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }
}
