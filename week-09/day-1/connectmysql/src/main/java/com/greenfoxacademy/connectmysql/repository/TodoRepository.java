package com.greenfoxacademy.connectmysql.repository;

import com.greenfoxacademy.connectmysql.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long>{

  List<Todo> findByDone(boolean done);
  Todo findByTitle(String title);
}
