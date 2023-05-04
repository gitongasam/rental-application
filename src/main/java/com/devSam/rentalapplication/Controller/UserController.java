package com.devSam.rentalapplication.Controller;

import com.devSam.rentalapplication.Entity.User;
import com.devSam.rentalapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/{userId}")

    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        User user = userService.getUserById(userId);

        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUserById(@PathVariable Long userId) {
        boolean isDeleted = userService.deleteUserById(userId);

        if (isDeleted) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
