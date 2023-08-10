package io.github.mat3e.controller;

import io.github.mat3e.model.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RepositoryRestController
class TaskController {
    public static final Logger logger = LoggerFactory.getLogger(TaskController.class);
    private final TaskRepository repository;


    TaskController(final TaskRepository repository) {
        this.repository = repository;
    }
    @GetMapping("/tasks")
    ResponseEntity<?> readAllTasks() {
        logger.warn("Exposing all the task!");
        return ResponseEntity.ok(repository.findAll());
    }


}
