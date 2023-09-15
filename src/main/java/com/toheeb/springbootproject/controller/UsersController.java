package com.toheeb.springbootproject.controller;

import org.springframework.web.bind.annotation.*;

//How to create Spring Boot REST service to handle HTTP GET, POST, PUT and DELETE requests
@RestController
@RequestMapping("/users")
public class UsersController {

@GetMapping
    public String getUser()
    {
       return  "http GET request was sent";
    }

    @PostMapping
    public String createUser()
    {
        return  "http POST request was sent";
    }

    @PutMapping
    public String updateUser()
    {
        return  "http PUT request was sent";
    }

    @DeleteMapping
    public String getUsers()
    {
        return  "http DELETE request was sent";
    }

}
