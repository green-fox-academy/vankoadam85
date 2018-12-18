package com.greenfoxacademy.todo_from_sql.controller;

import com.greenfoxacademy.todo_from_sql.model.Todo;
import com.greenfoxacademy.todo_from_sql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/addNew")
  public String addNewTodo() {
    return "newTodo";
  }

  @PostMapping("/addNew")
  public String createNewTodo(String title, boolean urgent) {
    todoService.addNewTodo(new Todo(title, urgent));
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String confirmDelete(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "confirmDelete";
  }

  @PostMapping("/{id}/delete")
  public String deleteTodo(@PathVariable("id") long id) {
    todoService.deleteTodoById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String editTodo(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo", todoService.getTodoById(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String confirmTodoEdit(@PathVariable("id") long id, String title, boolean urgent, boolean done) {
    todoService.updateTodoById(id, title, urgent, done);
    return "redirect:/todo/list";
  }

}

