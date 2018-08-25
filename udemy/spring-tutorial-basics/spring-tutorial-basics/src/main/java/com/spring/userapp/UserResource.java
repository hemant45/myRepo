package com.spring.userapp;

import com.spring.userExceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserResource {

    @Autowired
    private UserDaoService service;

    //retrieveAllUsers
    @GetMapping(path="/users")
    public List<User> retrieveAllUsers(){
        List<User> list = service.findAll();
        return list;
    }

    @GetMapping(path="/users/{id}")
    public User getUser(@PathVariable  int id){
        User user = service.findOne(id);
            if(user== null)
                    throw new UserNotFoundException("No record found for ID : " + id );

        return user;
    }

    @PostMapping(path="/users/")
    public ResponseEntity<User> addUser(@RequestBody User user){
        User userCreated=  service.save(user);
        URI location =ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
