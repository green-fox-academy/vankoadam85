package com.greenfoxacademy.todo_from_h2.repository;

import com.greenfoxacademy.todo_from_h2.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

}
