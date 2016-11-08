package com.SpringBootTest.controller;

import com.SpringBootTest.domain.Comment;
import com.SpringBootTest.domain.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by lich on 10/30/16.
 */
@RestController
@SessionAttributes("name")
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private CommentRepository commentRepository;

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="3") String name, ModelMap model) {
        Integer enentId = Integer.parseInt(name);
        List<Comment> commentList = commentRepository.findByEventid(enentId);
        String tmp = commentList.get(0).toString();
        model.put("name", name);
        System.out.println(name);
        return new Greeting(counter.incrementAndGet(),
                String.format(template, tmp));
    }
}


