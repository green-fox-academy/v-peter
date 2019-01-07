package com.greenfoxacademy.demo.model;

public class Resp {
  int received;
  int result;

  public Resp() {
  }

  public Resp(int received, int result) {
    this.received = received;
    this.result = result;
  }

  public int getReceived() {
    return received;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }

}
