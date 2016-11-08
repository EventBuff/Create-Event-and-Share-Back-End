package com.SpringBootTest.controller;

import com.SpringBootTest.domain.User;
import com.SpringBootTest.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by yanli on 11/6/16.
 */

@RestController
@SessionAttributes("visitor")
public class CheckProfileController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/profile")
    public User checkProfile(@RequestParam Integer userid){
        System.out.println("save " + userid.toString());
        if(userRepository.findByUserid(userid) != null){
            return(userRepository.findByUserid(userid));
        }
        else return null;
    }

    @ModelAttribute("visitor")
    public String getVisitor (HttpServletRequest request) {
        System.out.println(request.toString());
        String a = request.getSession().getId();
        return request.getSession().getId();
    }
}
