package com.greenfoxacademy.p2pchat.repository;

import com.greenfoxacademy.p2pchat.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}
