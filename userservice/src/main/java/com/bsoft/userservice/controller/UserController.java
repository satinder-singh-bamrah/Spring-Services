package com.bsoft.userservice.controller;

import com.bsoft.userservice.modal.User;
import com.bsoft.userservice.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRespository respository;

    @GetMapping("/all")
    public List<User> getUsers(){
        return respository.findAll();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    Optional<User> getUserByUserName(@PathVariable("id") String userid) {
        System.out.printf("Find User with Name: %s\n", userid);
        Optional<User> opt = respository.getUserById(userid);
        return opt;
    }

    @GetMapping("/user/ispremium")
    public Boolean isPremium(@RequestHeader("user_id") String userId) {
        System.out.printf("Find User with ID: %s\n", userId);
        Optional<User> opt = respository.getUserById(userId);
        Boolean isPremium = false;
        if (opt.isPresent()) {
            System.out.println("Check if Premium");
            isPremium = opt.get().getIs_premium();
        }
        return isPremium;
    }
}
