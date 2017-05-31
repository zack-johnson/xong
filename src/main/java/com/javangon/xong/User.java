package com.javangon.xong;

import java.util.UUID;

public final class User {
    private final UUID userId;

    public User(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }
}
