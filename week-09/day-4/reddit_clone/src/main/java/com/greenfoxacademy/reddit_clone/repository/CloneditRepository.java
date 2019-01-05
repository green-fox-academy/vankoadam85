package com.greenfoxacademy.reddit_clone.repository;

import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CloneditRepository extends PagingAndSortingRepository<Post, Long> {

  ArrayList<Post> findAllByOrderByScoreDesc();

  Page<Post> findAllByOrderByScoreDesc(Pageable pageable);

}
