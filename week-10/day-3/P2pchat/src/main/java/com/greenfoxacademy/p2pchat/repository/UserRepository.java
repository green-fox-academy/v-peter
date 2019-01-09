package com.greenfoxacademy.p2pchat.repository;

import com.greenfoxacademy.p2pchat.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
