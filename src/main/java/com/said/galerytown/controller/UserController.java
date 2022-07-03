package com.said.galerytown.controller;

import com.said.galerytown.entity.User;
import com.said.galerytown.exception.ApiException;
import com.said.galerytown.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class UserController {

    private final IUserService userService;

    @RequestMapping(value="/users", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @RequestMapping(value="/user/{user_id}", produces = {"application/json"}, method = RequestMethod.GET)
    public ResponseEntity<User> getUserById(@PathVariable("user_id") int userId) {
        return ResponseEntity.ok(userService.getUserById(userId));
    }

    @RequestMapping(value="/user", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<User> insertUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.insertUser(user));
    }

    @RequestMapping(value="/user/{user_id}", produces = {"application/json"}, method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable("user_id") int userId) throws Exception {
        return ResponseEntity.ok(userService.updateUser(user, userId));
    }

    @RequestMapping(value="/user/{user_id}", produces = {"application/json"}, method = RequestMethod.DELETE)
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("user_id") int userId) throws ApiException {
        userService.deleteUser(userId);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }
}
