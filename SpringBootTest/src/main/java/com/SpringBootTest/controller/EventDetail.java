package com.SpringBootTest.controller;

import com.SpringBootTest.domain.Event;
import com.SpringBootTest.domain.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanli on 11/6/16.
 */

@RestController
public class EventDetail {
    @Autowired
    private EventRepository eventRepository;

    @RequestMapping("/eventDetail")
    public Event eventDetail(Integer eventid){
        if(eventRepository.findByEventid(eventid) != null){
            return eventRepository.findByEventid(eventid);
        }
        else return null;
    }
}
