package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostCRUDRepository extends CrudRepository<Post, Long> {


}
