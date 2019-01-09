package com.greenfoxacademy.rest_practice.dto;

import java.util.ArrayList;

public class LogReportDto {

  private ArrayList<LogDto> entries;
  private long entry_count;

  public LogReportDto() {
    this.entries = new ArrayList<>();
  }

  public ArrayList<LogDto> getEntries() {
    return entries;
  }

  public void addEntry(LogDto logDto) {
    this.entries.add(logDto);
  }

  public long getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(long entry_count) {
    this.entry_count = entry_count;
  }
}
