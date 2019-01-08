package com.greenfoxacademy.connectmysql.service;

import com.greenfoxacademy.connectmysql.model.Assignee;
import com.greenfoxacademy.connectmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssigneeService {

  private AssigneeRepository repo;

  @Autowired
  public void setRepo(AssigneeRepository repo){
    this.repo = repo;
  }

  public Iterable<Assignee> listAll(){
    return this.repo.findAll();
  }

  public void delete(Assignee ass){
    this.repo.delete(ass);
  }

  public Assignee getAssigneeById(long id){
    return this.repo.findById(id).get();
  }

  public void addAssignee(Assignee ass){
    this.repo.save(ass);
  }

  public void editAssignee(Assignee ass) {
      repo.save(ass);
  }

  public Assignee getAssigneeByName(String name){
    return this.repo.findByName(name);
  }

}
