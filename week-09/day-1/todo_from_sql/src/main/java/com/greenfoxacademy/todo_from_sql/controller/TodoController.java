package com.greenfoxacademy.todo_from_sql.controller;

import com.greenfoxacademy.todo_from_sql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoService todoService;

  @Autowired
  TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @RequestMapping({"/", "/list"})
  public String list(@RequestParam(value = "isActive", required = false) boolean isActive, Model model) {
    if(isActive) {
      model.addAttribute("todoList", todoService.getAllActiveTodo());
    } else {
      model.addAttribute("todoList", todoService.getAllTodo());
    }
    return "todolist";
  }

}
