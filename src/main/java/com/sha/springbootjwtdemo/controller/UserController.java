package com.sha.springbootjwtdemo.controller;

import com.sha.springbootjwtdemo.model.Role;
import com.sha.springbootjwtdemo.security.UserPrincipal;
import com.sha.springbootjwtdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

/**
 * @author sa
 * @date 23.07.2023
 * @time 14:59
 */
@RestController
@RequestMapping("api/user")//pre-path
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PutMapping("change/{role}")//api/user/change/{role}
    public ResponseEntity<?> changeRole(@AuthenticationPrincipal UserPrincipal userPrincipal, @PathVariable Role role) {
        userService.changeRole(role, userPrincipal.getUsername());

        return ResponseEntity.ok(true);
    }

    @GetMapping("findAll")
    public ResponseEntity<?> findAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
