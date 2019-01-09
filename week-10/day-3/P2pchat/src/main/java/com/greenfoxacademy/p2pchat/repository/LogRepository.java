package com.greenfoxacademy.p2pchat.repository;

import com.greenfoxacademy.p2pchat.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends JpaRepository<Log, Long> {
}
