package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostCRUDRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

  private PostCRUDRepository repo;

  @Autowired
  public void setRepo(PostCRUDRepository repo) {
    this.repo = repo;
  }

  public Iterable<Post> listAll() {
    return repo.findAll();
  }

  public void addPost(Post post) {
    this.repo.save(post);
  }

  public Post getPostById(long id) {
    return this.repo.findById(id).get();
  }

  public void increaseVoteById(long id){
    Post modifiedPost = this.getPostById(id);
    modifiedPost.setVote(modifiedPost.getVote() + 1);
    this.repo.save(modifiedPost);
  }

  public void decreaseVoteById(long id){
    Post modifiedPost = this.getPostById(id);
    modifiedPost.setVote(modifiedPost.getVote() - 1);
    this.repo.save(modifiedPost);
  }
}
