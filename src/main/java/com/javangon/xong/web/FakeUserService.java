package com.javangon.xong.web;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FakeUserService implements UserService {
    private static final User FAKE = new User(UUID.randomUUID(), "fake");

    @Override
    public User getUserById(UUID userId) {
        return FAKE;
    }

    @Override
    public User getUserByUsername(String username) {
        return FAKE;
    }
}
