package com.devSam.rentalapplication.service;

import com.devSam.rentalapplication.Entity.User;
import com.devSam.rentalapplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User regsterUser(User user) {
        return userRepository.save(user);
    }
}