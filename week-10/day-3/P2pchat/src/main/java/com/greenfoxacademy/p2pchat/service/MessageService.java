package com.greenfoxacademy.p2pchat.service;

import com.greenfoxacademy.p2pchat.model.Message;
import com.greenfoxacademy.p2pchat.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class MessageService {

  JpaRepository repo;

  @Autowired
  public void setRepo(MessageRepository repo) {
    this.repo = repo;
  }

  public Iterable<Message> getAllMessage(){
    //this.repo.findAll().forEach(message -> System.out.println(message));
    //if(this.repo.findAll().isEmpty()) return Collections.emptyList();
    return this.repo.findAll();
  }

  public Message getDefaultMessage(){
    return new Message("App", "Hi there! Submit your message using the send button!");
  }
}
