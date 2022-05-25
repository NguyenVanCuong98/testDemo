package com.example.demo1status.controller;

import com.example.demo1status.entity.User;
import com.example.demo1status.in.UserIn;
import com.example.demo1status.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<List<User>>getAll(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?>create(@RequestBody UserIn userIn){
        return new ResponseEntity<User>(userService.create(userIn), HttpStatus.CREATED);
    }
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public User create(@PathVariable Integer id, @RequestBody UserIn userIn){
        return userService.update(id,userIn);
    }
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete( @PathVariable Integer id){
        userService.delete(id);
    }


}
