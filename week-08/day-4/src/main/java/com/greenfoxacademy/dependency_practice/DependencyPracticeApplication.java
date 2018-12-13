package com.greenfoxacademy.dependency_practice;

import com.greenfoxacademy.dependency_practice.Service.MyColor;
import com.greenfoxacademy.dependency_practice.Service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyPracticeApplication implements CommandLineRunner {

  private Printer printer;
  private MyColor myColor;

  @Autowired
  DependencyPracticeApplication(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyPracticeApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("whatever");
    myColor.printColor();
  }
}

