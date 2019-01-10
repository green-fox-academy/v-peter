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
  Message defaultMessage;

  MessageRepository repo;

  public MessageService() {
    this.defaultMessage = new Message("App", "Hi there! Submit your message using the send button!");
  }

  @Autowired
  public void setRepo(MessageRepository repo) {
    this.repo = repo;
  }


  public Iterable<Message> getAllMessage(){
    //this.repo.findAll().forEach(message -> System.out.println(message));
    //if(this.repo.findAll().isEmpty()) return Collections.emptyList();
    return this.repo.findAllExceptDefault();
  }

  public Message getDefaultMessage(){
    if(this.repo.findMessageByUserName("App") == null) this.repo.save(this.defaultMessage);
    return this.defaultMessage;
  }

  public void deleteAll(){
    this.repo.deleteAll();
  }

  public void addMessage(Message message){
    this.repo.save(message);
  }
}
