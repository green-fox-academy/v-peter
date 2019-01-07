package com.greenfoxacademy.demo.repository;

import com.greenfoxacademy.demo.model.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JPARepository extends JpaRepository<Log, Long> {

}
