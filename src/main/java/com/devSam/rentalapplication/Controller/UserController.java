package com.devSam.rentalapplication.Controller;

import com.devSam.rentalapplication.Entity.User;
import com.devSam.rentalapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("register/user")
    private User regiterUser(@RequestBody User user){
        return userService.regsterUser(user);
    }
}
