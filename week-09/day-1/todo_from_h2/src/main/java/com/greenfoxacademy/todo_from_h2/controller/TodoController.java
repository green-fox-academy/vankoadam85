package com.greenfoxacademy.todo_from_h2.controller;

import com.greenfoxacademy.todo_from_h2.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping({"/", "/list"})
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }

}
