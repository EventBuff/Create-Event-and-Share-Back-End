package com.SpringBootTest.controller;

import com.SpringBootTest.domain.Event;
import com.SpringBootTest.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * Created by yanli on 11/3/16.
 */

@RestController
@SessionAttributes("visitor")
public class SearchEventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping("/searchEvent")
    public List<Event> searchEvent(String eventtag, @ModelAttribute("visitor") String visitor){
        List <Event> eventList;
        System.out.println(visitor + "sss");
        if(eventtag == null || eventtag.length() == 0){
            eventList = eventRepository.findAll();
        }
        else {
            eventList = eventRepository.findByEventtag(eventtag);
        }
        return eventList;
    }

}
