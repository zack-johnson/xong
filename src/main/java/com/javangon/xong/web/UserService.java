package com.javangon.xong.web;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID userId);
    User getUserByUsername(String username);
}
