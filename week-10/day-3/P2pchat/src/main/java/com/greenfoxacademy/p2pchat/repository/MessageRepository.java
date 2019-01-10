package com.greenfoxacademy.p2pchat.repository;

import com.greenfoxacademy.p2pchat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

  @Query(value = "SELECT * FROM Message WHERE user_name != 'App'", nativeQuery = true)
  Iterable<Message> findAllExceptDefault();

  Message findMessageByUserName(String userName);
}
