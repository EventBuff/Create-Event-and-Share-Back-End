package com.SpringBootTest.controller;

import com.SpringBootTest.domain.EventRepository;
import com.SpringBootTest.domain.User;
import com.SpringBootTest.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanli on 11/6/16.
 */

@RestController
public class CheckProfileController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/profile")
    public User checkProfile(Integer userid){
        if(userRepository.findByUserid(userid) != null){
            return(userRepository.findByUserid(userid));
        }
        else return null;
    }
}
