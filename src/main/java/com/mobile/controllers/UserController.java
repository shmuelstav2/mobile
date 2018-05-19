package com.mobile.controllers;

import com.mobile.domain.Sivukim;
import com.mobile.domain.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Created by olyjosh on 19/05/2018.
 */
@Controller
@RequestMapping("/api")
public class UserController {


    @PostMapping(value = "/login")
    private ResponseEntity login(@RequestBody User user) {
        //TODO: your find operation code to be replace the dummy user below
        //TODO: like userRepo.findOne(id)

        User findedUser = new User();//new User("user", "password");
        findedUser.setUsername("user");
        findedUser.setPassword("pass");
        if (findedUser == null){
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
        if(findedUser.getUsername().equals(user.getUsername()) &&
                findedUser.getPassword().equals(user.getPassword())){
            return new ResponseEntity(HttpStatus.OK);
        }else {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }

    }


}
