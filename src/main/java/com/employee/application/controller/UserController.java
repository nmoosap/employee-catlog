package com.employee.application.controller;

import com.employee.application.model.User;
import com.employee.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static com.employee.application.util.Constants.DELETE_RESPONSE;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userServiceImpl;

    @GetMapping()
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userServiceImpl.getAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> get(@PathVariable("id") Integer id) {
        User user = userServiceImpl.findById(id);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping()
    public ResponseEntity<User> create(@RequestBody User user) {
        userServiceImpl.add(user);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(location).body(user);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable("id") Integer id, @RequestBody User user) {
        user.setId(id);
        userServiceImpl.update(user);
        URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/{id}")
                .buildAndExpand(id).toUri();
        return ResponseEntity.created(location).body(user);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) {
        userServiceImpl.removeById(id);
        return new ResponseEntity<>(DELETE_RESPONSE, HttpStatus.OK);
    }
}