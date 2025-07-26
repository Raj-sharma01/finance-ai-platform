package com.finance.user.controller;

import com.finance.user.dto.UserRequest;
import com.finance.user.dto.UserResponse;
import com.finance.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserResponse registerUser(@RequestBody UserRequest request) {
        return userService.registerUser(request);
    }

    // NOTE: In real app, you get userId from JWT auth. For now, take userId as query param.
    @GetMapping("/me")
    public UserResponse getCurrentUser(@RequestParam UUID userId) {
        return userService.getCurrentUser(userId);
    }
}
