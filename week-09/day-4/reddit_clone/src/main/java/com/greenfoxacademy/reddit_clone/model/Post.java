package com.greenfoxacademy.reddit_clone.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post implements Comparable<Post>{

  @Id
  @GeneratedValue
  private long id;
  @CreationTimestamp
  private Date createdTime;
  private String title;
  @Column(columnDefinition = "TEXT")
  private String body;
  private String mediaURL;
  private int score;

  public Post() {
    this.score = 1;
  }

  public long getId() {
    return id;
  }

  public Date getCreatedTime() {
    return createdTime;
  }

  public String getTitle() {
    return title;
  }

  public String getBody() {
    return body;
  }

  public String getMediaURL() {
    return mediaURL;
  }

  public int getScore() {
    return score;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setMediaURL(String mediaURL) {
    this.mediaURL = mediaURL;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public int compareTo(Post post) {
    return post.getScore() - this.getScore();
  }
}
