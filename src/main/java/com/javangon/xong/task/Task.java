package com.javangon.xong.task;

import java.util.UUID;

public final class Task {
    private final UUID id;
    private final String description;

    public Task(UUID id, String description) {
        this.id = id;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
