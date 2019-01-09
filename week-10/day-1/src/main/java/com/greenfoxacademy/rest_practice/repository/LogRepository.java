package com.greenfoxacademy.rest_practice.repository;

import com.greenfoxacademy.rest_practice.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
