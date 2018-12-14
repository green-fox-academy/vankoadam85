package com.greenfoxacademy.bank_of_simba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankOfSimbaApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(BankOfSimbaApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Service started");
  }
}
