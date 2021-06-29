package com.bsoft.userservice.controller;

import com.bsoft.userservice.modal.User;
import com.bsoft.userservice.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.Query;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRespository respository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return respository.findAll();
    }

    @GetMapping("/user")
    @ResponseBody
    Optional<User> getUserByUserName(@RequestParam String username) {
        Optional<User> opt = respository.getUserByUserName(username);
        return opt;
    }

    @GetMapping("/user/isPremium")
    public Boolean isPremium(@RequestParam String id) {
        Optional<User> opt = respository.getUserById(id);
        Boolean isPremium = false;
        if (opt.isPresent()) {
            if (opt.get().getUser_type() == 1) isPremium = true;
        }
        return isPremium;
    }
}
