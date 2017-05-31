package com.javangon.xong;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FakeUserService implements UserService {
    private static final User FAKE = new User(UUID.randomUUID());

    @Override
    public User getUserById(UUID userId) {
        return FAKE;
    }
}
