package com.greenfoxacademy.connectmysql.repository;

import com.greenfoxacademy.connectmysql.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

  List<Todo> findByDone(boolean done);

  Todo findByTitle(String title);

  @Query(value = "SELECT * FROM Todo WHERE assignee_id = ?1", nativeQuery = true)
  List<Todo> findTodosPerAssigneeId(long id);

  @Query(value = "SELECT t FROM Todo t WHERE done = ?1")
  List<Todo> vmi(boolean done);
}
