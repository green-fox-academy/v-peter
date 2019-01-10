package com.greenfoxacademy.p2pchat.service;

import com.greenfoxacademy.p2pchat.model.Log;
import com.greenfoxacademy.p2pchat.model.User;
import com.greenfoxacademy.p2pchat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

  UserRepository repo;

  @Autowired
  public void setRepo(UserRepository repo){
    this.repo = repo;
  }

  public void addUser(User user) {
    this.repo.save(user);
  }

  public List<User> getAll(){
    return repo.findAll();
  }

  public User getCurrentUser(){
    return repo.getCurrentUser();
  }
}
