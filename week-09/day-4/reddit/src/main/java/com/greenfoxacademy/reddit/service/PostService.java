package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostCRUDRepository;
import com.greenfoxacademy.reddit.repository.PostJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

  private PostJPARepository jparepo;
  private PostCRUDRepository repo;

  @Autowired
  public void setRepo(PostCRUDRepository repo) {
    this.repo = repo;
  }

  @Autowired
  public void setJpaRepo(PostJPARepository jparepo) {
    this.jparepo = jparepo;
  }

  public Iterable<Post> listAll() {

    List<Post> list = new ArrayList<>();
    repo.findAll().forEach(list::add);
    return list.stream()
        .sorted(Comparator.comparing(Post::getVote).reversed())
        .limit(10)
        .collect(Collectors.toList());
//    return jparepo.findOrderByVote();
  }

  public List<Post> listFirstTen() {
    return repo.findTop10ByOrderByVoteDesc();
  }

  public void addPost(Post post) {
    this.repo.save(post);
  }

  public Post getPostById(long id) {
    return this.repo.findById(id).get();
  }

  public void increaseVoteById(long id) {
    Post modifiedPost = this.getPostById(id);
    modifiedPost.setVote(modifiedPost.getVote() + 1);
    this.repo.save(modifiedPost);
  }

  public void decreaseVoteById(long id) {
    Post modifiedPost = this.getPostById(id);
    modifiedPost.setVote(modifiedPost.getVote() - 1);
    this.repo.save(modifiedPost);
  }
}
