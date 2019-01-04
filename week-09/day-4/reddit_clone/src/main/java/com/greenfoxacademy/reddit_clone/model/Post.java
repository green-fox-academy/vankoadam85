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
  private Date postDate;
  private String title;
  @Column(columnDefinition = "TEXT")
  private String body;
  private String mediaURL;
  private int score;

  Post() {
    this.score = 1;
  }

  public Post(String title, String body) {
    this.title = title;
    this.body = body;
  }

  public long getId() {
    return id;
  }

  public Date getPostDate() {
    return postDate;
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

  public void increaseScore() {
    this.score++;
  }

  public void decreaseScore() {
    this.score--;
  }

  @Override
  public int compareTo(Post post) {
    return post.getScore() - this.getScore();
  }
}
