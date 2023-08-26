package com.dev2prod.ticket.user.controller;


import com.dev2prod.ticket.user.entity.UserEntity;
import com.dev2prod.ticket.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userObj) {
        userService.saveUser(userObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserEntity getUserById(@PathVariable Long userId) {
        return userService.getUserDetailsById(userId);
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity removeUser(@PathVariable Long userId){
        userService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{userId}/project/{projectId}")
    public UserEntity assignCaisseToUser(
            @PathVariable Long userId,
            @PathVariable Long caisseId
    ){
        return userService.assignCaisseToUser(userId, caisseId);
    }
    
    @PutMapping("/update/{userId}")
    public ResponseEntity updateUser(@PathVariable Long userId, @RequestBody UserEntity userObj) {
        if (userService.updateUser(userId, userObj)) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
