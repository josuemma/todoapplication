package com.techtask.todoapplication.repositries;

import org.springframework.data.repository.CrudRepository;

import com.techtask.todoapplication.models.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {

}
