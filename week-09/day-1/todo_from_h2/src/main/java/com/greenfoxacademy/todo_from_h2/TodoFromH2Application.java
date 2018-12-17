package com.greenfoxacademy.todo_from_h2;

import com.greenfoxacademy.todo_from_h2.model.Todo;
import com.greenfoxacademy.todo_from_h2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoFromH2Application implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(TodoFromH2Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day", true));
    todoRepository.save(new Todo("Finish H2 workshop 1", false));
    todoRepository.save(new Todo("Finish JPA workshop 2", false));
    todoRepository.save(new Todo("Create a CRUD Project", false));
  }
}

