package com.javangon.xong;

import java.util.Collection;

public interface TaskService {
    Collection<Task> getAllTasks(User user);
}