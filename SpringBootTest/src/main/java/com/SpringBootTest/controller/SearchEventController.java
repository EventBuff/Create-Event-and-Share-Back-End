package com.SpringBootTest.controller;

import com.SpringBootTest.domain.EventRepository;
import com.SpringBootTest.domain.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yanli on 11/3/16.
 */

@RestController
public class SearchEventController {

    @Autowired
    private EventRepository eventRepository;

    @RequestMapping("/searchEvent")
    public List<Event> searchEvent(){
        List<Event> eventList = eventRepository.findAll();
        return eventList;
    }

}
