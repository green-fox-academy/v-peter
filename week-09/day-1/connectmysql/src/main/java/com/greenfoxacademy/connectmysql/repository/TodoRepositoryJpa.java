package com.greenfoxacademy.connectmysql.repository;

import com.greenfoxacademy.connectmysql.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TodoRepositoryJpa extends JpaRepository<Todo, Long> {

  @Query(value = "SELECT t FROM Todo t WHERE done = ?1")
  List<Todo> vmi(boolean done);
}
