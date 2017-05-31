package com.javangon.xong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.UUID;

@RestController
public class TaskController {

    private final UserService userService;
    private final TaskService taskService;

    @Autowired
    public TaskController(UserService userService, TaskService taskService) {
        this.userService = userService;
        this.taskService = taskService;
    }

    @RequestMapping(value = "/tasks/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Task> helloWorld(@PathVariable UUID userId) {
        User user = userService.getUserById(userId);
        return taskService.getAllTasks(user);
    }
}
