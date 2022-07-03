package com.said.galerytown.service;

import com.said.galerytown.entity.User;
import com.said.galerytown.exception.ApiException;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();

    User insertUser(User user);

    User getUserById(int userId);

    User updateUser(User user, int userId) throws Exception;

    void deleteUser(int userId) throws ApiException;
}
