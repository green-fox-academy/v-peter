package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostCRUDRepository extends CrudRepository<Post, Long> {

  List<Post> findTop10ByOrderByVoteDesc();
}
