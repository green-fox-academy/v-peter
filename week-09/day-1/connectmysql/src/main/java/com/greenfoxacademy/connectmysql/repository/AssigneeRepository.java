package com.greenfoxacademy.connectmysql.repository;

import com.greenfoxacademy.connectmysql.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {


}
