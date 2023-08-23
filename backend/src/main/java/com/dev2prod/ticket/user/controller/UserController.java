package com.dev2prod.ticket.user.controller;

import com.dev2prod.ticket.user.entity.UserEntity;
import com.dev2prod.ticket.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService UserService;

    @PostMapping("/save")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity userObj) {
        UserService.saveUser(userObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getUsers")
    public List<UserEntity> getAllUsers() {
        return UserService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public UserEntity getUserById(@PathVariable Long userId) {
        return UserService.getUserDetailsById(userId);
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity removeUser(@PathVariable Long userId){
        UserService.deleteUser(userId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{userId}/project/{projectId}")
    public UserEntity assignCaisseToUser(
            @PathVariable Long userId,
            @PathVariable Long caisseId
    ){
        return UserService.assignCaisseToUser(userId, caisseId);
    }
}
