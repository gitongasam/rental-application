package com.devSam.rentalapplication.service;

import com.devSam.rentalapplication.Entity.User;

import java.util.List;

public interface UserService {
    User regsterUser(User user);

    List<User> findAllUser();

    List<Object> findById(Long id);

    User getUserById(Long userId);

    boolean deleteUserById(Long userId);
}
