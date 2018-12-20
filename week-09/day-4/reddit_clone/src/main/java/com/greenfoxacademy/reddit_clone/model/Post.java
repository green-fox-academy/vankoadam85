package com.greenfoxacademy.reddit_clone.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

  @Id
  @GeneratedValue
  private long id;
  @CreationTimestamp
  private Date postDate;
  private String title;
  @Column(columnDefinition = "TEXT")
  private String postBody;
  private String mediaLink;
  private int score;

  Post() {
    this.score = 1;
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

  public String getPostBody() {
    return postBody;
  }

  public String getMediaLink() {
    return mediaLink;
  }

  public int getScore() {
    return score;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setPostBody(String postBody) {
    this.postBody = postBody;
  }

  public void setMediaLink(String mediaLink) {
    this.mediaLink = mediaLink;
  }

  public void increaseScore() {
    this.score++;
  }

  public void decreaseScore() {
    this.score--;
  }

}
