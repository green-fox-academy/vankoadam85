package com.greenfoxacademy.todo_from_sql.service;

import com.greenfoxacademy.todo_from_sql.model.Todo;
import com.greenfoxacademy.todo_from_sql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public ArrayList<Todo> getAllTodo() {
    ArrayList<Todo> allTodo = new ArrayList<>();
    todoRepository.findAll().forEach(allTodo::add);
    return allTodo;
  }

  public ArrayList<Todo> getAllActiveTodo() {
    ArrayList<Todo> allActiveTodo = new ArrayList<>();
    for (Todo todo : todoRepository.findAll()) {
      if(!todo.isDone()) {
        allActiveTodo.add(todo);
      }
    }
    return allActiveTodo;
  }

  public Todo getTodoById(long id) {
    return todoRepository.findById(id).get();
  }

  public void addNewTodo(Todo todo) {
    todoRepository.save(todo);
  }

  public void deleteTodoById(long id) {
    todoRepository.deleteById(id);
  }

  public void updateTodoById(long id, String title, boolean urgent, boolean done) {
    Todo todoToEdit = todoRepository.findById(id).get();
    todoToEdit.setTitle(title);
    todoToEdit.setUrgent(urgent);
    todoToEdit.setDone(done);
    todoRepository.save(todoToEdit);
  }

}
