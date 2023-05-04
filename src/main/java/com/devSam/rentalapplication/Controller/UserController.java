package com.devSam.rentalapplication.Controller;

import com.devSam.rentalapplication.Entity.User;
import com.devSam.rentalapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/auth/")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register/user")
    private User regiterUser(@RequestBody User user){
        return userService.regsterUser(user);
    }
    @GetMapping("/getAllUser")
    private List<User> getAllUser(){
        return userService.findAllUser();
    }
}
