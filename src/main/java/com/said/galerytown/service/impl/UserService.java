package com.said.galerytown.service.impl;

import com.said.galerytown.entity.User;
import com.said.galerytown.exception.ApiException;
import com.said.galerytown.exception.enums.UserExceptionEnum;
import com.said.galerytown.repository.IUserRepository;
import com.said.galerytown.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User insertUser(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public User getUserById(int userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public User updateUser(User user, int userId) throws ApiException {
        User existingUser = userRepository.findUserById(userId);
        if(Objects.isNull(existingUser)) {
            throw new ApiException(UserExceptionEnum.USER_NOT_FOUND.getCode(),
                                            UserExceptionEnum.USER_NOT_FOUND.getMessage());
        }
        user.setId(userId);
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(int userId) throws ApiException {
        try {
            userRepository.deleteById(userId);
        } catch (Exception exception) {
            throw new ApiException(UserExceptionEnum.USER_NOT_FOUND.getCode(),
                    UserExceptionEnum.USER_NOT_FOUND.getMessage());
        }
    }
}
