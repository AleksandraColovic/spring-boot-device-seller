package com.sha.springbootjwtdemo.controller;

import com.sha.springbootjwtdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/admin")//pre-path
@RequiredArgsConstructor
public class AdminController {
    private final UserService userService;

    @GetMapping("all")//api/admin/all
    public ResponseEntity<?> findAllUsers() {
        return ResponseEntity.ok(userService.findAllUsers());
    }
}
