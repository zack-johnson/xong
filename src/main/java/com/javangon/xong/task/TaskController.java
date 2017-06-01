package com.javangon.xong.task;

import com.javangon.xong.web.User;
import com.javangon.xong.web.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class TaskController {

    private final UserService userService;
    private final TaskService taskService;

    @Autowired
    public TaskController(UserService userService, TaskService taskService) {
        this.userService = userService;
        this.taskService = taskService;
    }

    @RequestMapping(value = "/user/{username}/tasks", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Task> helloWorld(@PathVariable String username) {
        User user = userService.getUserByUsername(username);
        return taskService.getAllTasks(user);
    }
}
