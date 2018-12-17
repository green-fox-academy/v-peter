package com.greenfoxacademy.connectmysql.repository;

import com.greenfoxacademy.connectmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
}
