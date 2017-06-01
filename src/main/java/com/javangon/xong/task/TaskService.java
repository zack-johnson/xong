package com.javangon.xong.task;

import com.javangon.xong.web.User;

import java.util.Collection;

public interface TaskService {
    Collection<Task> getAllTasks(User user);
}