package com.stevemu.todo.controllers;

import com.stevemu.todo.entities.Todo;
import com.stevemu.todo.repositories.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TodoController {

    @Autowired
    TodoRepo todoRepo;

    @GetMapping("/api/todos")
    public List<Todo> getAllTodos() {
        System.out.println(todoRepo.findAll());
        return todoRepo.findAll();

    }
}
