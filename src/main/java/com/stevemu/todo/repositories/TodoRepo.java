package com.stevemu.todo.repositories;

import com.stevemu.todo.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<Todo, Integer> {
}
