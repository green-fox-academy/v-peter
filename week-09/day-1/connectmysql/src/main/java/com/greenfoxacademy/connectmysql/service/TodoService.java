package com.greenfoxacademy.connectmysql.service;

import com.greenfoxacademy.connectmysql.model.Todo;
import com.greenfoxacademy.connectmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class TodoService {

  TodoRepository repo;

  @Autowired
  public void setRepo(TodoRepository repo) {
    this.repo = repo;
  }

  public List<Todo> listActive() {
//    List<Todo> list = new ArrayList<>();
//    this.repo.findAll().forEach(list::add);
////    ArrayList<Todo> result = new ArrayList<Todo>();
////    for (Todo item:
////         list) {
////      if(!item.isDone()) result.add(item);
////    }
//    List<Todo> result = list.stream()
//        .filter(Todo -> !Todo.isDone())
//        .collect(Collectors.toList());
    return repo.findByDone(false);
  }

  public Iterable<Todo> listAll() {
    // ArrayList<Todo> list = new ArrayList<>();
    //.forEach(list::add);
//    list.sort(Comparator.comparing(Todo::getId));
    return this.repo.findAll();
  }

  public Todo getTodoById(long id) {
    return this.repo.findById(id).get();
  }

  public void deleteTodo(Todo todo) {
    this.repo.delete(todo);
  }

  public void addTodo(Todo todo) {
    if (todo != null) repo.save(todo);
  }

  public Todo getTodoByTitle(String title) {
    return this.repo.findByTitle(title);
  }

}
