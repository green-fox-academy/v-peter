package com.greenfoxacademy.connectmysql.service;

import com.greenfoxacademy.connectmysql.model.Todo;
import com.greenfoxacademy.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class Service {

  TodoRepository repo;

  @Autowired
  public void setRepo(TodoRepository repo) {
    this.repo = repo;
  }

  public List<Todo> listActive() {
    List<Todo> list = new ArrayList<>();
    this.repo.findAll().forEach(list::add);
//    ArrayList<Todo> result = new ArrayList<Todo>();
//    for (Todo item:
//         list) {
//      if(!item.isDone()) result.add(item);
//    }
    List<Todo> result =  list.stream()
        .filter(Todo -> !Todo.isDone())
        .collect(Collectors.toList());
    return result;
  }

  public ArrayList<Todo> listAll() {
    ArrayList<Todo> list = new ArrayList<>();
    this.repo.findAll().forEach(list::add);
    return list;
  }


}
