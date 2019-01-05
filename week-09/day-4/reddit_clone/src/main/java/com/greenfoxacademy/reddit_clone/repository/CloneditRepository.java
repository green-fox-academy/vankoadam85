package com.greenfoxacademy.reddit_clone.repository;

import com.greenfoxacademy.reddit_clone.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CloneditRepository extends PagingAndSortingRepository<Post, Long> {

  Page<Post> findAllByOrderByScoreDesc(Pageable pageable);

}
