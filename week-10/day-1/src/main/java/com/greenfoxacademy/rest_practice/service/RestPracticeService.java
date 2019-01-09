package com.greenfoxacademy.rest_practice.service;

import com.greenfoxacademy.rest_practice.dto.LogDto;
import com.greenfoxacademy.rest_practice.dto.LogReportDto;
import com.greenfoxacademy.rest_practice.model.Log;

import java.util.ArrayList;

public interface RestPracticeService {

  int doubleNumber(int input);

  int sum(int input);

  int factor(int input);

  String greet(String name, String title);

  String appendA(String appendable);

  int sumArray(int... input);

  int multiplyArray(int... input);

  int[] doubleArray(int... input);

  void saveLog(String endpoint, String data);

  Iterable<Log> getAllLogs();

  long getCountOfLogEntries();

  LogReportDto getLogReport();

  LogDto convertLogToLogDto(Log log);

}
