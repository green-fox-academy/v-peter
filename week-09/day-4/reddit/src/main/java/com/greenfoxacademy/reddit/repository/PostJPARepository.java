package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostJPARepository extends JpaRepository<Post, Long> {

@Query(value="SELECT * FROM Post ORDER BY vote DESC LIMIT ?1", nativeQuery = true)
    public List<Post> findPostsOrderByVote(long limit);
}
