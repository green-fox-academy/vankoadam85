package com.greenfoxacademy.reddit_clone.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {

  @Id
  @GeneratedValue
  private long id;
  @CreationTimestamp
  private Date postDate;
  private String body;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "postId", nullable = false)
  @OnDelete(action = OnDeleteAction.CASCADE)
  private Post post;

  public Comment() {
  }

  public Comment(String body) {
    this.body = body;
  }

  public long getId() {
    return id;
  }

  public Date getPostDate() {
    return postDate;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Post getPost() {
    return post;
  }

  public void setPost(Post post) {
    this.post = post;
  }
}
