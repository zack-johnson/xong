package com.javangon.xong.web;

import java.util.UUID;

public final class User {
    private final UUID userId;
    private final String userName;

    public User(UUID userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }
}
